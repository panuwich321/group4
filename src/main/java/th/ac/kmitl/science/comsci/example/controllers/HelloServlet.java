package th.ac.kmitl.science.comsci.example.controllers;

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
        String message = "Hello World!!!";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

}
