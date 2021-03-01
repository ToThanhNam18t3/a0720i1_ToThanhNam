import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Directory_Servlet", urlPatterns = "/search")
public class Directory_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String search = request.getParameter("english");
        String result = dictionary.get(search); // Truy Cap Phan Tu Cua Map
        if(result != null){
            request.setAttribute("search", search);
            request.setAttribute("result", result);
        } else {
            System.out.println("NOT FOUND");
        }
        request.getRequestDispatcher("jsp/home.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/home.jsp").forward(request,response);
    }
}
