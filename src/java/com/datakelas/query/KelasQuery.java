/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datakelas.query;
import com.datakelas.dao.KelasDAO;
import com.datakelas.model.Kelas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vunun
 */
public class KelasQuery implements KelasDAO{
    private Connection conn = null;
    public KelasQuery(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Kelas kls) {
        String sql = "insert into kelas_tb(kodekelas, jurusan, namakelas, ketuakelas, walikelas, jumlahsiswa) values (?,?,?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kls.getKd());
            st.setString(2, kls.getJurusan());
            st.setString(3, kls.getNama());
            st.setString(4, kls.getKetua());
            st.setString(5, kls.getWali());
            st.setString(6, kls.getJml());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String kodekelas) {
        String sql = "delete from kelas_tb where kodekelas=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kodekelas);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String oldkodekelas, Kelas kls) {
        String sql = "UPDATE kelas_tb SET jurusan=?, namakelas=?,ketuakelas=?,walikelas=?, jumlahsiswa=? WHERE kodekelas=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kls.getJurusan());
            st.setString(2, kls.getNama());
            st.setString(3, kls.getKetua());
            st.setString(4, kls.getWali());
            st.setString(5, kls.getJml());
            st.setString(6, oldkodekelas);
            st.executeUpdate();
            st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Kelas loadKelas(String jurusan) {
        Kelas kelas = null;
        String sql = "SELECT kodekelas, namakelas, ketuakelas, walikelas, jumlahsiswa FROM kelas_tb WHERE jurusan=?";
    try {
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
            if (rs.next()) {
                kelas = new Kelas();
                kelas.setkd(rs.getString(1));
                kelas.setJurusan(rs.getString(2));
                kelas.setNama(rs.getString(3));
                kelas.setKetua(rs.getString(4));
                kelas.setWali(rs.getString(5));
                kelas.setJml(rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kelas;
    }

    @Override
    public Kelas load(String kodekelas) {
        Kelas kelas = null;
        String sql = "SELECT kodekelas,jurusan, namakelas, ketuakelas,walikelas, jumlahsiswa FROM kelas_tb WHERE kodekelas=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kodekelas);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
            kelas = new Kelas();
            kelas.setkd(rs.getString(1));
            kelas.setJurusan(rs.getString(2));
            kelas.setNama(rs.getString(3));
            kelas.setKetua(rs.getString(4));
            kelas.setWali(rs.getString(5));
            kelas.setJml(rs.getString(6));
            }
        } catch (SQLException ex) {
        Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return kelas;
    }

    @Override
    public List<Kelas> getAll() {
        String sql = "SELECT kodekelas,jurusan, namakelas, ketuakelas,walikelas,jumlahsiswa FROM kelas_tb";
        List<Kelas> list = new ArrayList<Kelas>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            Kelas s = new Kelas();
            s.setkd(rs.getString(1));
            s.setJurusan(rs.getString(2));
            s.setNama(rs.getString(3));
            s.setKetua(rs.getString(4));
            s.setWali(rs.getString(5));
            s.setJml(rs.getString(6));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
    }

    @Override
    public List<Kelas> getAll(String nama) {
        String sql = "SELECT * FROM kelas_tb WHERE namakelas like?";
        List<Kelas> list = new ArrayList<Kelas>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            Kelas s = new Kelas();
            s.setkd(rs.getString(1));
            s.setJurusan(rs.getString(2));
            s.setNama(rs.getString(3));
            s.setKetua(rs.getString(4));
            s.setWali(rs.getString(5));
            s.setJml(rs.getString(6));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<Kelas> getAllKd(String kodekelas) {
        String sql = "SELECT * FROM kelas_tb WHERE kodekelas LIKE ?";
        List<Kelas> list = new ArrayList<Kelas>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + kodekelas + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            Kelas s = new Kelas();
            s.setkd(rs.getString(1));
            s.setJurusan(rs.getString(2));
            s.setNama(rs.getString(3));
            s.setKetua(rs.getString(4));
            s.setWali(rs.getString(5));
            s.setJml(rs.getString(6));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
