package controller;

import common.regex.Regex;
import dto.customerDto;
import model.customer.Customer;
import model.customer.CustomerType;
import service.CustomerService.CustomerService;
import service.CustomerService.CustomerServiceImpl;
import service.CustomerService.CustomerTypeService;
import service.CustomerService.CustomerTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    private CustomerService customerService = new CustomerServiceImpl();
    private CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();

    protected void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Customer> customerList = this.customerService.getAllCustomer();
//        request.setAttribute("customers", customerList);
        // ------------------------------------
        List<customerDto> customerDtoList = this.customerService.getCustomerAndCustomerType();
        request.setAttribute("customers", customerDtoList);

        request.getRequestDispatcher("jsp/customer/listDto.jsp").forward(request, response);
    }

    protected void viewCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        Customer customer = this.customerService.findById(id);
        request.setAttribute("customer", customer);

        request.getRequestDispatcher("jsp/customer/view.jsp").forward(request, response);
    }

    protected void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("ID"));
        this.customerService.removeCustomer(id);

        listCustomer(request, response);
    }

    protected void viewCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Customer> customerList = this.customerService.getAllCustomer();

            List<CustomerType> customerTypes = this.customerTypeService.getAllCustomerType();

        request.setAttribute("customersType", customerTypes);

        request.getRequestDispatcher("jsp/customer/create.jsp").forward(request, response);
    }

    protected void updateCustomerView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        Customer customer = this.customerService.findById(id);

        request.setAttribute("customer", customer);

        request.getRequestDispatcher("jsp/customer/edit.jsp").forward(request, response);
    }

    protected void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int idKhachHang = Integer.parseInt(request.getParameter("customerId"));
        int idLoaiKhach = Integer.parseInt(request.getParameter("customerTypeId"));
        String hoten = request.getParameter("customerName");
        String ngaysinh = request.getParameter("customerDob");
        String cmtnd = request.getParameter("customerIdentity");
        String sdt = request.getParameter("customerNumberPhone");
        String email = request.getParameter("customerEmail");
        String diachi = request.getParameter("customerAddress");

        Customer customer = new Customer(idKhachHang, idLoaiKhach, hoten, ngaysinh, cmtnd, sdt, email, diachi);

        this.customerService.updateById(idKhachHang, customer);

        listCustomer(request, response);
    }

    protected void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int idKhachHang = Integer.parseInt(request.getParameter("customerId").trim());
        int idLoaiKhach = Integer.parseInt(request.getParameter("customerType").trim());
        String hoten = request.getParameter("customerName").trim();
        String ngaysinh = request.getParameter("customerDob").trim();
        String cmtnd = request.getParameter("customerIdentity").trim();
        String sdt = request.getParameter("customerNumberPhone").trim();
        String email = request.getParameter("customerEmail").trim();
        String diachi = request.getParameter("customerAddress").trim();
        Customer customer = new Customer(idKhachHang, idLoaiKhach, hoten, ngaysinh, cmtnd, sdt, email, diachi);

        String messagePhone = null;
        boolean flag = true;
        if (!Regex.regexPhone(sdt)) {
            messagePhone = "Ban nhap sai !";
            flag = false;
        }

        if (!flag) {
            request.setAttribute("customer", customer);
            request.setAttribute("message", messagePhone);
            viewCreateCustomer(request, response);
        } else {
            this.customerService.save(customer);
            listCustomer(request, response);
        }
    }

    protected void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("name");
        List<customerDto> customerDtoList = name == null ? this.customerService.getCustomerAndCustomerType() : this.customerService.getCustomerByNameDto(name);

        request.setAttribute("customers",customerDtoList);
        request.setAttribute("customerName", name);
        request.getRequestDispatcher("jsp/customer/listDto.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                viewCreateCustomer(request, response);
                break;
            case "view":
                viewCustomers(request, response);
                break;
            case "delete":
                try {
                    deleteCustomer(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
                updateCustomerView(request, response);
                break;
            default:
                try {
                    listCustomer(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createCustomer(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
                try {
                    updateCustomer(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "search":
                try {
                    searchCustomer(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    System.out.println("loi search");
                }
                break;
            default:
                try {
                    listCustomer(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
        }
    }
}
