package com.example.backend4f;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "registrazione", value = "/registrazione")
public class Login extends HttpServlet {
    private String username;
    private String password;
    private String nome;
    private String cognome;
    private Boolean Sesso;

    public void init() {
        //Azioni eseguite all'accesso della pagina registrazione
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Per ora vuoto poichè non bisogna fare azioni di ricevere ma solo mandare informazioni

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Mandare al server tutte le informazioni inserite in una form (per ora solo base)

        HttpSession session = request.getSession(true);

        session.setAttribute("username", username);
        session.setAttribute("password", password);
        session.setAttribute("nome", nome);
        session.setAttribute("cognome", cognome);
        session.setAttribute("sesso", sesso);


    }

    public void destroy() {
        //Azioni eseguite alla disconessione della pagina login
    }
}