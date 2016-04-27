/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.self.controller;

import com.dumbweb.self.dao.DepartmentDAO;
import com.dumbweb.self.dao.impl.DepartmentDAOImpl;
import com.dumbweb.self.entity.Department;
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
@WebServlet(name = "departmentController", urlPatterns = {"/department/*"})
public class DepartmentController extends Controller {

    private DepartmentDAO departmentDAO = new DepartmentDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String viewPage = "/WEB-INF/views/department/index.jsp";

        if (request.getRequestURI().contains("/add")) {
            viewPage = "/WEB-INF/views/department/add.jsp";
        }

        request.setAttribute("deptList", departmentDAO.getAll());
        request.setAttribute("department", departmentDAO.getById(1));

        request.getRequestDispatcher(viewPage).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Department d = new Department();
        d.setCode(request.getParameter("deptCode"));
        d.setName(request.getParameter("deptName"));
        d.setDescription(request.getParameter("deptDesc"));
        d.setStatus((request.getParameter("status"))!=null);
        
        departmentDAO.insert(d);
        
        response.sendRedirect(request.getContextPath()+"/department/index.jsp");
    }

    
    
    
}
