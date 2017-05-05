package auth;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet(name = "PoemServlet")
public class PoemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text");

        PrintWriter writer = response.getWriter();
//        List<Art> arts = ((Poet) request.getSession().getAttribute("user")).getArts();
//        if(request.getRequestURI().equals("/arts")){
//            Gson gson = new Gson();
//            System.out.println(arts);
//            writer.print(gson.toJson(arts));
//        }
                writer.print("[{ \"publishDate\":\"John\", \"path\":\"/arany/valami0.txt\", \"title\":\"New York\" }]");
    }
}
