<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página inicial da aplicação</title>
    </head>
    <body>
        Olá. Você digitou: 
        <%
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            String nomeUsuario = (String) request.getAttribute("nomeUsuario");
            String senha = (String) request.getAttribute("senha");
            String idade = (String) request.getAttribute("Idade");
            String altura = (String) request.getAttribute("Altura");
            
            out.print("<p id=p01>Nome usuario:" + nomeUsuario + "</p>");
            out.print("<p id=p02>Senha: " + senha + "</p>");
            out.print("<p id=p03>Idade:" + idade + "</p>");
            out.print("<p id=p04>Altura:" + altura + "</p>");
        %>
    </body>
</html>
