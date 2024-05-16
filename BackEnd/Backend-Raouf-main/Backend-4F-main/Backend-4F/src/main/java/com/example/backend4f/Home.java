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
        //Impostazione del messaggio di successo d'accesso
        message = "Hai effettuato l'accesso";

        //Ricavare il nome dell'username dalla query string per personalizzare le informazioni
        username = (request.getParameter("username"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Tutto il code dopo da fare per cambiare le informazioni

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Per ora non c'è nulla da mandare

    }

    public void destroy() {
        //Azioni eseguite al log out
    }
}