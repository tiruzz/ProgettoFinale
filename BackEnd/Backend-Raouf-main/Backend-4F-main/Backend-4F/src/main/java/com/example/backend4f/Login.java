package com.example.backend4f;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class Login extends HttpServlet {
    private String username;
    private String password;

    public void init() {
        //Azioni eseguite all'accesso della pagina login
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Ricavare il valore delle credenziali dalla query string
        username = (request.getParameter("username"));
        password = (request.getParameter("password"));


        //Verifica delle informazioni ricevute
        if (username == "gino" and password == "pasquale") {
            //Creazione della sessione in caso affermativo
            HttpSession session = request.getSession(true);

            //Passaggio dell'attributo nome utente per pagina home e ricavare dati
            session.setAttribute("username", username);
            response.sendRedirect("/home")

        } else {

            //In caso negativo impostazione del messaggio di errore
            HttpSession session = request.getSession(true);
            String message = "sbagliato username o password";

            //Indirizzamento alla pagina di errore attribuendo il valore di errore
            session.setAttribute("error", message);
            response.sendRedirect("/errore")
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Non c'è nulla da mandare ma solo da ricevere e verificare

    }

    public void destroy() {
        //Azioni eseguite alla disconessione della pagina login
    }
}