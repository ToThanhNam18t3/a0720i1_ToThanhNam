package Controller;

import Model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShowCus_Servlet", urlPatterns = "/customer")
public class ShowCus_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/showCus.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

        List<Customer> myCustomer = new ArrayList<>();
        myCustomer.add(new Customer("Mai Van Hoan","1982/12/08","Ha Noi","image/img.jpg"));
        myCustomer.add(new Customer("Nguyễn Văn Nam","1983/08/21","Da Nang","image/img2.png"));
        myCustomer.add(new Customer("Nguyễn Thái Hòa","1983/08/22","Quang Nam","image/img.jpg"));
        myCustomer.add(new Customer("Trần Đăng Khoa","1982/08/17","Quang Ngai","image/img.jpg"));
        myCustomer.add(new Customer("Nguyễn Đình Thi","1983/08/19","Ha Tinh","image/img.jpg"));

        request.setAttribute("myCustomer",myCustomer);
        request.getRequestDispatcher("jsp/showCus.jsp").forward(request,response);
    }
}
