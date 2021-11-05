
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

		<link	href="/css/jquery-ui.css" rel="stylesheet">
						<script	src="../js/jquery.js"></script>
						<script	src="../js/jquery-ui.js"></script>
<meta charset="ISO-8859-1">
<title>Adiciona banda</title>
  </head>
  
<body>
   <c:import	url="cabecalho.jsp"	/>
   
   
      <form action="adicionaContato">
        Nome: <input type="text" name="nome" /><br />
        Genero <input type="text" name="genero" /><br />


        <input type="submit" value="Gravar" />
      </form>
      
      
      
      <c:import	url="rodape.jsp"	/>
    </body>
</html>