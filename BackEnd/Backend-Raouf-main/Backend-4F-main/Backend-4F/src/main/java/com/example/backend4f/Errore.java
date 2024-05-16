package com.example.backend4f;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "errore", value = "/errore")
public class Errore extends HttpServlet {

    //Creazione della variabile messaggio per determinare a schermo l'errore
    private String message;

    public void init() {
        //Azioni eseguite all'avvio della pagina errore ovvero ricevere il messaggio dalle altre pagine
        HttpSession session = request.getSession();
        message = session.message;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Per ora vuoto poichè non ci sono informazioni da ricevere ma da mandare

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Restituzione del messaggio errore nella modalita post con messaggio ricevuto dalle altre pagine

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

    }

    public void destroy() {
        //Azioni eseguite alla disconessione dalla pagina di errore
    }
}