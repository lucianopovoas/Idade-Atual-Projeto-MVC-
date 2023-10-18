package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pessoa;
import java.util.Calendar;

public class MeuServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recupere os parâmetros do formulário
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        String fezAniversario = request.getParameter("fezAniversario");

        // Calcule a idade atual
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        if ("sim".equals(fezAniversario)) {
            anoAtual = anoAtual - 1;
        }
        int idade = anoAtual - anoNascimento;

        // Crie um objeto Pessoa com os dados
        Pessoa pessoa = new Pessoa(nome, endereco, anoNascimento, "sim".equals(fezAniversario));

        // Envie os dados para a página JSP
        request.setAttribute("pessoa", pessoa);
        request.setAttribute("idade", idade);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}