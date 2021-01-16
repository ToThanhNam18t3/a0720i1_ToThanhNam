package Controller;

import Model.Product;
import Service.ProductService;
import Service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Product_Servlet", urlPatterns = "/search")
public class Search_Servlet extends HttpServlet {
    private ProductService service = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/products/search.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name").trim();

        List<Product> productList = name == null ? service.displayAllProduct() : service.findByName(name); // Hoi lai tutor
//        response.setContentType("text/plain"); // Hoi Lai tutor
//        response.getWriter().write(productList.toString()); // Hoi lai tutor
        request.setAttribute("products", productList);
        request.getRequestDispatcher("jsp/products/result.jsp").forward(request, response);
    }
}
