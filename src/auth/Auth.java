package auth;

import sun.misc.BASE64Decoder;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Auth extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        for (Poet poet : PoetSingle.getInstance().getPoets()) {
            if(poet.getUser().equals(username) && poet.getPw().equals(password)){
                req.getSession().setAttribute("user", poet);
                req.setAttribute("success", true);
                System.out.println(poet.getArtsRealPath(req.getServletContext().getRealPath("")));

                req.getRequestDispatcher("/mainpage").forward(req, res);
                return;
            }
        }
        req.setAttribute("success", false);
        req.getRequestDispatcher("/").forward(req, res);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();

    }
}