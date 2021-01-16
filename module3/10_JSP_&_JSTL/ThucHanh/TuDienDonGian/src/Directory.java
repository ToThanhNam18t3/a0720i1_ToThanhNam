import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Directory", urlPatterns = "/search")
public class Directory extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> listWords = new HashMap<>();
        listWords.put("hello", "xin chao");
        listWords.put("how", "Thế nào");

        String search = request.getParameter("input");

        String result = listWords.get(search);

        if(result != null){
            request.setAttribute("word",search);
            request.setAttribute("result",result);
        } else {
            request.setAttribute("result",result);
        }
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}