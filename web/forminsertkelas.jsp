<%-- 
    Document   : forminsertkelas
    Created on : Dec 1, 2013, 8:13:40 AM
    Author     : Vunun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Data Kelas SMK Telkom</title>
        <link href="IMAGES/CarpeDiem.png" rel="shortcut icon" />
    </head>
    <body>

    <center>
        <table width="550">
            <tr>
                <td>
            <center> 		
                <font face="Arial Black, Gadget, sans-serif" color="Blue" size="+3">Form Input Data Kelas</font>
                <br>
                <br>
                <br>
                
            </center>
            </td>
            </tr>
        </table>
        <table width="550">
            <form action="InsertActionKelas.jsp" method="POST">
                <tr width="25%">
                    <td rowspan="7"><img src="IMAGES/CarpeDiem.png" width="120" ><br><img src="IMAGES/sandhyputra.png" width="120"></td>
                   
                </tr>
                <tr>
                    <td><br><font face="Arial Black, Gadget, sans-serif" color="#000000" size="+1" style="margin-left:80px;"> Kode Kelas : </font>
                    </td>
                    <td><br><input type="text" name="txtkodekelas" style="margin-left:0px;">
                    </td>
                </tr>
                <tr>
                    <td><br><font face="Arial Black, Gadget, sans-serif" color="#000000" size="+1" style="margin-left:80px;"> Jurusan : </font>
                    </td>
                    <td><br><input type="text" name="txtjurusan" style="margin-left:0px;">
                    </td>
                </tr>
                <tr>
                    <td><br><font face="Arial Black, Gadget, sans-serif" color="#000000" size="+1" style="margin-left:80px;"> Nama Kelas : </font>
                    </td>
                    <td><br><input type="text" name="txtnamakelas" style="margin-left:0px;">
                    </td>
                </tr>
                <tr>
                    <td><br><font face="Arial Black, Gadget, sans-serif" color="#000000" size="+1" style="margin-left:80px;"> Ketua Kelas : </font>
                    </td>
                    <td><br><input type="text" name="txtketuakelas" style="margin-left:00px;">
                    </td>
                </tr>
                <tr>
                    <td><br><font face="Arial Black, Gadget, sans-serif" color="#000000" size="+1" style="margin-left:80px;"> Wali Kelas : </font>
                    </td>
                    <td><br><input type="text" name="txtwalikelas" style="margin-left:0px;">
                    </td>
                </tr>
                <tr>
                    <td><br><font face="Arial Black, Gadget, sans-serif" color="#000000" size="+1" style="margin-left:80px;"> Jumlah Siswa : </font>
                    </td>
                    <td><br><input type="text" name="txtjumlahsiswa" style="margin-left:0px;">
                    </td>
                </tr>
                <tr>
                    <td colspan="3" rowspan="2"><br><input type="submit" value="Simpan Data" style="margin-left:360px;"></td>
                </tr>
                 

            </form>
        </table>
    </center>
</body>
</html>