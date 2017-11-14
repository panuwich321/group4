package th.ac.kmitl.science.comsci.example.controllers;

import th.ac.kmitl.science.comsci.example.models.Hello;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet
        extends HttpServlet {

    public HelloServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = new Hello().getMessage();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
        out.println("<ul>");  
        out.println("<li>Bearchitect</li>");
        out.println("<li>58050237 Chayapol Limanon</li>");
        out.println("<li>57050294 Pichavarit Panyokaew</li>");
        out.println("<li>58050276 Thanathat Surakhup</li>");
        out.println("<li>58050309 Pasthiyakan Kaewpitak</li>");
        out.println("<li>58050355 Panuwich Laoudom</li>");
        out.println("<li>57050269 Patipon Taweechat</li>");
        out.println("<li>57050279 Piyapon Suntikan</li>");
        out.println("<li>57050356 Apiwoot Narunatwattana</li>");
        out.println("<li>57050252 Nontakhon kerdmongkol</li>");
        out.println("<li>57050203 Charunthron Rattanamanoporn</li>");
        out.println("<li>57050298 Piirush Sanguandeekul</li>");
        out.println("<li>57050221 Nattadet Vijaranakul</li>");
        out.println("<li>58050315 Phatipan Suwanich</li>");
        out.println("</ul>");
    }
}
