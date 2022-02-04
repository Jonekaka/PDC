package web.servlet;

import service.impl.ThoughtServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("aaa");
        ThoughtServiceImpl thoughtService = new ThoughtServiceImpl();
        thoughtService.recorderThis(name);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("已录入");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
