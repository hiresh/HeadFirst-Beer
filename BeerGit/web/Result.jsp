<%-- 
    Document   : Result
    Created on : Feb 14, 2016, 8:25:43 PM
    
    Author     : Hiresh
--%>
<%@ page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  
    <style>
        body{
            background:url("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRkYxpdBvLbBdEnM2iQ2erYxVhqQc2sP2aabJlDWJlh-8de7liRLA");
            background-size: cover;
        }
        
    </style>    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your choice</title>
        <h2><center><u>BEER SELECTION ADVICE</u></center><br></h2>
    </head>
    <body>
        <%
            if(request.getParameter("password").equals("hiresh")){
             List result=(List)request.getAttribute("styles");
             out.println("<br><center><h2>Got your beer color - </h2></center> <center> <h1>" + request.getParameter("color") + "</h1></center> ");

                if (result.size() != 0) {
                for (int i = 0; i < result.size(); i++) {
                    out.println("<center>---<strong>" + result.get(i) + "</strong></center><br>");
                }
            }
            }
            %>
    </body>
</html>
