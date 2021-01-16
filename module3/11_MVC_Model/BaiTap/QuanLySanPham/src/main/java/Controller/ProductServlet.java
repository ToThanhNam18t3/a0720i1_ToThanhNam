package Controller;

import Model.Product;
import Service.ProductService;
import Service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    protected void listProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = this.productService.displayAllProduct();
        request.setAttribute("products",products);

        request.getRequestDispatcher("jsp/products/list.jsp").forward(request,response);
    }

    protected void viewProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        Product product = this.productService.findById(id);
        request.setAttribute("product",product);

        request.getRequestDispatcher("jsp/products/view.jsp").forward(request,response);
    }

    protected void deleteProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        this.productService.remove(id);

        listProducts(request,response);
    }

    protected void viewCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/products/create.jsp").forward(request,response);
    }

    protected void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        String name =  request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        // Blob de hoi tutor
        String image = request.getParameter("image");
        
        Product product = new Product(id,name,price,image);
        this.productService.save(product);
    }

    protected void viewUpdateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        Product product = this.productService.findById(id);

        request.setAttribute("product",product);
        request.getRequestDispatcher("jsp/products/edit.jsp").forward(request,response);
        // CHon ra 1 doi tuong bang ID , sau do set ID vao doi tuong do de update
        //  Chuyen toi trang edit
    }

    protected void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        String name =  request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        // Blob de hoi tutor
        String image = request.getParameter("image");

        Product product = new Product(id,name,price,image);
        this.productService.updateProduct(id,product);
        listProducts(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        } switch (action){
            case "create":
                viewCreateCustomer(request,response);
                break;
            case "view":
                viewProducts(request,response);
                break;
            case "delete":
                deleteProducts(request,response);
                break;
            case "edit":
                viewUpdateProduct(request,response);
                break;
            default:
                listProducts(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = " ";
        }
        switch(action){
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
            default:
                listProducts(request,response);
                break;
        }
    }
}
