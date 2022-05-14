package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas {
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> listEmpresas = banco.getEmpresas();
		
		request.setAttribute("empresas", listEmpresas);
		
		return "forward:listaEmpresas.jsp";
	}
}