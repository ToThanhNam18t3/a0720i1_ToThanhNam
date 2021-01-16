import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Change_Money_Servlet", urlPatterns = "/convert")
public class Change_Money_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float rate = Float.parseFloat(request.getParameter("rate"));
        Float usd = Float.parseFloat(request.getParameter("USD"));
        if (rate < 0) {
            request.getRequestDispatcher("jsp/error.jsp").forward(request,response);
        } else if(usd < 0){
            request.getRequestDispatcher("jsp/error.jsp").forward(request,response);
        }
        Float total = rate * usd;
        request.setAttribute("changed", total);
        request.getRequestDispatcher("jsp/home.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("jsp/home.jsp").forward(request,response);
    }
}
