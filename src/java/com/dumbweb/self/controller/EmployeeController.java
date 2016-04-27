/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.self.controller;

import com.dumbweb.self.dao.EmployeeDAO;
import com.dumbweb.self.dao.impl.EmployeeDAOImpl;
import com.dumbweb.self.entity.Employee;
import com.dumbweb.self.util.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "employeeController", urlPatterns = {"/employee/*"})
public class EmployeeController extends Controller {

    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String viewPage = "/WEB-INF/views/employee/index.jsp";

        if (request.getRequestURI().contains("/add")) {
            viewPage = "/WEB-INF/views/employee/add.jsp";
        }
        request.setAttribute("empList", employeeDAO.getAll());
        request.getRequestDispatcher("/WEB-INF/views/employee/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Employee e = new Employee();
        
        e.setName(request.getParameter("name"));
        e.setEmail(request.getParameter("email"));
        e.setContact(request.getParameter("contact"));
        int id = Integer.parseInt(request.getParameter("dptId"));
        e.setDeptId(id);
        e.setStatus((request.getParameter("name")!=null));
        employeeDAO.insert(e);
        
        response.sendRedirect(request.getContextPath()+"/employee/index.jsp");
                
    }
    
    

}
