/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import com.datakelas.model.Kelas;
import com.datakelas.query.KelasQuery;
import com.datakelas.utils.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vunun
 */
@WebServlet(name = "InsertActionKelas", urlPatterns = {"/InsertActionKelas.jsp"})
public class InsertActionKelas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Kelas kelas = new Kelas();
        kelas.setkd(request.getParameter("txtkodekelas"));
        kelas.setJurusan(request.getParameter("txtjurusan"));
        kelas.setNama(request.getParameter("txtnamakelas"));
        kelas.setKetua(request.getParameter("txtketuakelas"));
        kelas.setWali(request.getParameter("txtwalikelas"));
        kelas.setJml(request.getParameter("txtjumlahsiswa"));
        try {
            DBConnection conn = DBConnection.getInstance();
            KelasQuery daoKelas = new KelasQuery(conn.getCon());
            daoKelas.insert(kelas);
        } catch (Exception e) {
            System.out.println("gagal");
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Data Berhasil Disimpan</title>");
            out.println("<link href=\"IMAGES/CarpeDiem.png\" rel=\"shortcut icon\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td bgcolor='#FFF'>");
            out.println("<br>");
            out.println("<center><font face='Arial Black, Gadget, sans-serif' color='#000000' size='+3'> Data Berhasil Disimpan </font></center>");
            out.println("<br><br>");
            out.println("<center><a href='forminsertkelas.jsp'><font face='Arial Black, Gadget, sans-serif' color='#000000' size='+1'>kembali</font></a></center>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
