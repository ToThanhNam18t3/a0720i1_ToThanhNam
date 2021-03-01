package Controller;

import Model.Author;
import Model.Product;
import Model.ThuVienDTO;
import Service.AuthorService;
import Service.AuthorServiceImpl;
import Service.ProductService;
import Service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    private AuthorService authorService = new AuthorServiceImpl();

    protected void listProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
//        List<Product> products = this.productService.displayAllProduct();
//        List<Author> authors = this.authorService.displayAllAuthor();
//        request.setAttribute("products", products);
//        request.setAttribute("authors", authors);
        // ---------------------- CÁCH MỘT DÀNH CHO MẤY BỌN GÀ ---------------------
        List<ThuVienDTO> thuVienDTOList = this.productService.getAllInfoDTO();
        request.setAttribute("thuVienDTOList",thuVienDTOList);


//        request.getRequestDispatcher("jsp/products/list.jsp").forward(request, response);  //Cách 1

        request.getRequestDispatcher("jsp/products/listCach2.jsp").forward(request,response);
    }

    protected void viewProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        Product product = this.productService.findById(id);
        request.setAttribute("product", product);

        request.getRequestDispatcher("jsp/products/view.jsp").forward(request, response);
    }

    protected void deleteProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("ID"));
        this.productService.remove(id);

        listProducts(request, response);
    }

    protected void viewCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Author> authors = this.authorService.displayAllAuthor();
        request.setAttribute("authors", authors);
        request.getRequestDispatcher("jsp/products/create.jsp").forward(request, response);
    }

    protected void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("ID"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String image = request.getParameter("image");
        int idAuthor = Integer.parseInt(request.getParameter("author"));

        Product product = new Product(id, name, price, image, idAuthor);
        this.productService.save(product);
        listProducts(request, response);
    }


    protected void viewUpdateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        Product product = this.productService.findById(id);

        request.setAttribute("product", product);
        request.getRequestDispatcher("jsp/products/edit.jsp").forward(request, response);
        // CHon ra 1 doi tuong bang ID , sau do set ID vao doi tuong do de update
        //  Chuyen toi trang edit
    }

    protected void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("ID"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String image = request.getParameter("image");
        int idAuthor = Integer.parseInt(request.getParameter("author"));

        Product product = new Product(id, name, price, image, idAuthor);
        this.productService.updateProduct(id, product);
        listProducts(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                viewCreateCustomer(request, response);
                break;
            case "view":
                viewProducts(request, response);
                break;
            case "delete":
                try {
                    deleteProducts(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
                viewUpdateProduct(request, response);
                break;
            default:
                try {
                    listProducts(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
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
        switch (action) {
            case "create":
                try {
                    createProduct(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
                try {
                    updateProduct(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            default:
                try {
                    listProducts(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
        }
    }
}
