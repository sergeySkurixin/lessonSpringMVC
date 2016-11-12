package ru.sbt.lessons.servlet.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/say-hello")
public class SayHelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        req.setAttribute("name", name == null ? "World" : name);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/index.jsp");
        dispatcher.forward(req, resp);


//        String name = req.getParameter("name");
//
//        PrintWriter writer = resp.getWriter();
//        writer.println("Hello Dear " + name);
    }
}
