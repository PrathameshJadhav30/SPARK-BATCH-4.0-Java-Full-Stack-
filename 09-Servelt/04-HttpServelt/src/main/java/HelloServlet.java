//import jakarta.servlet.http.HttpServlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    // Handles GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Welcome to My First HttpServlet!</h2>");
        out.println("<form method='post'>");
        out.println("Enter your name: <input type='text' name='username'/>");
        out.println("<input type='submit' value='Submit'/>");
        out.println("</form>");
        out.println("</body></html>");
    }

    // Handles POST requests
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Hello, " + name + "! Thanks for submitting the form.</h2>");
        out.println("</body></html>");
    }
}
