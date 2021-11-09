<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html> 
    
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> organizar shows</title>
</head>
<body>
<div align="center">
    <h2>Organizar Bandas</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/new">New Customer</a></h3>
    <table style="border-collapse: separate; border-spacing: 10px;" >
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>genero</th>
            
        </tr>
        <c:forEach items="${listCustomer}" var="customer">
        <tr>
            <td>${banda.id}</td>
            <td>${banda.nome}</td>
            <td>${banda.genero}</td>
            
            <td>
                <a href="/edit?id=${banda.id}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/delete?id=${banda.id}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>