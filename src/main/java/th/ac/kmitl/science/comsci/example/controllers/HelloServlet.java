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
        out.println("<li>58050276 Thanathat Surakhup</li>")
        out.println("</ul>");
    }
}
