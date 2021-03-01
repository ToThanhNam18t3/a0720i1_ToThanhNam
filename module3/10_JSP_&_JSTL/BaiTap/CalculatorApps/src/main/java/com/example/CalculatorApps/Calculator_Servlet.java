package com.example.CalculatorApps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Calculator_Servlet", urlPatterns = "/calculate")
public class Calculator_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float num1 = Float.parseFloat(request.getParameter("first-operand"));
        Float num2 = Float.parseFloat(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);

        request.setAttribute("num1",num1);
        request.setAttribute("num2",num2);
        request.setAttribute("operator",operator);

        float result = Calculate.calculate(num1,num2,operator);
        request.setAttribute("result",result);
        request.getRequestDispatcher("jsp/result.jsp").forward(request,response);
    }
}
