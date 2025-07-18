import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServeltLifeCycle extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init() Called - Initilaization ");
    }

    @Override
    public void service(ServletRequest Reqt, ServletResponse Res) throws ServletException, IOException {
        System.out.println("Service() Called - Handling Request");
        Res.setContentType("text/html");
        PrintWriter out = Res.getWriter();
        out.println("<h2> Hello from Prathamesh Jadhav Servelt Life Cycle </h2>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() Called - Servelt destroy");
    }
}
