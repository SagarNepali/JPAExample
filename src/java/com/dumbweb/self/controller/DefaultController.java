/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.self.controller;

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
@WebServlet(name = "defaultController" , urlPatterns = {"/"})
public class DefaultController extends Controller {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String viewPage ="/WEB-INF/views/index.jsp";
        
        if(request.getRequestURI().contains("/login.jsp")){
            viewPage = "/WEB-INF/views/login.jsp";
        }
        request.getRequestDispatcher(viewPage).forward(request, response);
    }
    
    
}
