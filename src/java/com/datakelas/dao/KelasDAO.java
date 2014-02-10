/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datakelas.dao;
import com.datakelas.model.Kelas;
import java.util.List;
/**
 *
 * @author Vunun
 */
public interface KelasDAO {
    public void insert(Kelas kls);
    public void delete(String kodekelas);
    public void update(String oldkodekelas, Kelas kls);
    public Kelas loadKelas(String jurusan);
    public Kelas load(String kodekelas);
    public List<Kelas>getAll();
    public List<Kelas>getAll(String nama);
    public List<Kelas>getAllKd(String kodekelas);
    
}
