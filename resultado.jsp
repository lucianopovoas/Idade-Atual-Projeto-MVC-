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
    <p>Endereço: ${pessoa.endereco}</p>
    <p>Ano de Nascimento: ${pessoa.anoNascimento}</p>
    <p>Fez aniversário este ano? ${pessoa.fezAniversario ? "Sim" : "Não"}</p>
    <p>Idade: ${idade} anos</p>
</body>
</html>