<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
    <h1>Resultado</h1>
    <p>Nome: ${pessoa.nome}</p>
    <p>Endere�o: ${pessoa.endereco}</p>
    <p>Ano de Nascimento: ${pessoa.anoNascimento}</p>
    <p>Fez anivers�rio este ano? ${pessoa.fezAniversario ? "Sim" : "N�o"}</p>
    <p>Idade: ${idade} anos</p>
</body>
</html>