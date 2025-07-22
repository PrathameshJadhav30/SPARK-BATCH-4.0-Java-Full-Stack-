import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

public class SetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("username");

        Cookie cookie = new Cookie("user", name);
        cookie.setMaxAge(60 * 60); // 1 hour
        response.addCookie(cookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Cookie set for user: " + name + "</h3>");
        out.println("<a href='getcookie'>Get Cookie</a> | <a href='index.html'>Back</a>");
    }
}
