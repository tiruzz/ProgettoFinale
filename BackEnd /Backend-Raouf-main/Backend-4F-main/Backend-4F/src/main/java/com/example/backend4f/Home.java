package com.example.backend4f;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class Home extends HttpServlet {
    private String message;
    private String username;
    private String password;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        

    }

    public void destroy() {
    }
}