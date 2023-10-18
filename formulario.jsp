<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Idade</title>
</head>
<body>
    <form action="MeuServlet" method="GET">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome"><br>
        
        <label for="endereco">Endereço:</label>
        <input type="text" id="endereco" name="endereco"><br>
        
        <label for="anoNascimento">Ano de Nascimento:</label>
        <input type="number" id="anoNascimento" name="anoNascimento"><br>
        
        <label for="fezAniversario">Já fez aniversário este ano?</label>
        <input type="radio" id="sim" name="fezAniversario" value="sim">Sim
        <input type="radio" id="nao" name="fezAniversario" value="nao">Não<br>
        
        <input type="submit" value="Calcular Idade">
    </form>
</body>
</html>