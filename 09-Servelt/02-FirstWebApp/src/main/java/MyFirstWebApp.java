import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstWebApp extends GenericServlet {


    @Override
    public void service(ServletRequest Req, ServletResponse Res) throws ServletException, IOException {
          Res.setContentType("text/html");
        PrintWriter out = Res.getWriter();
        out.println("<h2> Hello from Prathamesh Jadhav </h2>");
    }
}
