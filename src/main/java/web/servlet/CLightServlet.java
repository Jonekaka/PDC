package web.servlet;

import util.ReadTxt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

@WebServlet("/clightServlet")
public class CLightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ReadTxt readTxt = new ReadTxt();
        String ip = readTxt.getFileContent();
        Socket socket = new Socket(ip, 2333);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("light_close".getBytes("utf-8"));
        outputStream.close();
        socket.close();
        response.sendRedirect(request.getContextPath()+"/index.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
