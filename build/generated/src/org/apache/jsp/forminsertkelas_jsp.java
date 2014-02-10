package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forminsertkelas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert Data Kelas SMK Telkom Malang</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <br>\n");
      out.write("    <center>\n");
      out.write("        <table width=\"550\">\n");
      out.write("            <tr>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            <center> \t\t\n");
      out.write("            \t<font face=\"Arial Black, Gadget, sans-serif\" color=\"#0000FF\" size=\"+3\"> Form Input Data Kelas! </font>\n");
      out.write("                <br><br>\n");
      out.write("                <img src=\"IMAGE/Moklets.png\" width=\"100\" height=\"100\">\n");
      out.write("            </center>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <table width=\"550\">\n");
      out.write("            <form action=\"InsertActionKelas.jsp\" method=\"POST\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><br><font face=\"Arial Black, Gadget, sans-serif\" color=\"#000000\" size=\"+1\" style=\"margin-left:80px;\"> Kode Kelas : </font>\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtkodekelas\" style=\"margin-left:0px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br><font face=\"Arial Black, Gadget, sans-serif\" color=\"#000000\" size=\"+1\" style=\"margin-left:80px;\"> Jurusan : </font>\n");
      out.write("                    </td>\n");
      out.write("                    <td><br><input type=\"text\" name=\"txtjurusan\" style=\"margin-left:0px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br><font face=\"Arial Black, Gadget, sans-serif\" color=\"#000000\" size=\"+1\" style=\"margin-left:80px;\"> Nama Kelas : </font>\n");
      out.write("                    </td>\n");
      out.write("                    <td><br><input type=\"text\" name=\"txtnamakelas\" style=\"margin-left:0px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br><font face=\"Arial Black, Gadget, sans-serif\" color=\"#000000\" size=\"+1\" style=\"margin-left:80px;\"> Ketua Kelas : </font>\n");
      out.write("                    </td>\n");
      out.write("                    <td><br><input type=\"text\" name=\"txtketuakelas\" style=\"margin-left:00px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br><font face=\"Arial Black, Gadget, sans-serif\" color=\"#000000\" size=\"+1\" style=\"margin-left:80px;\"> Wali Kelas : </font>\n");
      out.write("                    </td>\n");
      out.write("                    <td><br><input type=\"text\" name=\"txtwalikelas\" style=\"margin-left:0px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br><font face=\"Arial Black, Gadget, sans-serif\" color=\"#000000\" size=\"+1\" style=\"margin-left:80px;\"> Jumlah Siswa : </font>\n");
      out.write("                    </td>\n");
      out.write("                    <td><br><input type=\"text\" name=\"txtjumlahsiswa\" style=\"margin-left:0px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td colspan=\"2\" rowspan=\"2\"><br><input type=\"submit\" value=\"Proses Data\" style=\"margin-left:360px;\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
