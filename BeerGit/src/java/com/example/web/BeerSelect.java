/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import com.example.model.BeerExpert;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Toshiba
 */
public class BeerSelect extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BeerSelect</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BeerSelect at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //    processRequest(request, response);
        
        	response.setContentType("text/html");
                String pass="hiresh";
	PrintWriter out = response.getWriter();
	
                if(request.getParameter("password").equals(pass)){
	
        out.println("<center><u>BEER SELECTION ADVICE</u></center><br>");
	String clr=request.getParameter("color");
	
	out.println("<br><center><h2>Got your beer color - </h2></center> <center> <h1>" +clr +"</h1></center> ");

        BeerExpert expert=new BeerExpert();
        
        List result=expert.getBrands(clr);
        Iterator it= result.iterator();
//        while(it.hasNext()){
//            out.println(it.next());
//        }

if(result.size()!=0){
    for(int i=0;i<result.size();i++)
  out.println("<center>---<strong>"+result.get(i)+"</strong></center><br>");  
}
        }
        else{
            out.println("<center><strong><u>WRONG PASSWORD</u></strong></center>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
