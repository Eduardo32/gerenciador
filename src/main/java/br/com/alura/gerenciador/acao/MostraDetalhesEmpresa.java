package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraDetalhesEmpresa {
	public void executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Integer idEmpresa = Integer.valueOf(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscaEmpresaPorId(idEmpresa);
		
		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);
	}
}
