package com.example.backend4f;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class Login extends HttpServlet {
    private String message;
    private String username;
    private String password;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("User Agent:" + request.getHeader("User-Agent"));
        username = (request.getParameter("username"));
        password = (request.getParameter("password"));

        if (username == "gino" and password == "Pasquale") {
            response.setContentType("text/html");
            // Hello
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("</body></html>");
        } else {
            //response.sendError(HttpServletResponse.SC_NOT_FOUND, "Non trovato");

            HttpSession session = request.getSession(true);
            String message = "sbagliato";

             session.setAttribute("error", message);
            response.sendRedirect("/errore")
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("Host:" + request.getHeader("Host"));
        System.out.println("Accept-Encoding:" + request.getHeader("Accept-Encoding:"));
        System.out.println("If-None-Match:" + request.getHeader("If-None-Match:"));

        response.setContentType("text/txt");
        PrintWriter out = response.getWriter();
        out.println("Buongiorno Galvani!");

    }

    public void destroy() {
    }
}