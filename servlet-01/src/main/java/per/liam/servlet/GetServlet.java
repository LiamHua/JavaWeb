package per.liam.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liam
 * @date 20-1-4 下午10:44
 * @discription
 */
@WebServlet(name = "GetServlet")
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf8");
        ServletContext context = this.getServletContext();
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
        //resp.sendRedirect("/hello/success.jsp");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/success.jsp");
        requestDispatcher.forward(req,resp);
    }
}
