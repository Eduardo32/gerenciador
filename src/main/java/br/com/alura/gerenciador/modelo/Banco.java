package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listEmpresas = new ArrayList<>();
	private static List<Usuario> listUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(Banco.chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.chaveSequencial++);
		empresa2.setNome("Caelum");
		
		Banco.listEmpresas.add(empresa);
		Banco.listEmpresas.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("teste1");
		u1.setSenha("12345");
		Usuario u2 = new Usuario();
		u2.setLogin("teste2");
		u2.setSenha("67890");
		
		Banco.listUsuarios.add(u1);
		Banco.listUsuarios.add(u2);
		
	}
	
	public void salvar(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.listEmpresas.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.listEmpresas;
	}

	public void removeEmpresa(Integer idEmpresa) {
		Iterator<Empresa> it = listEmpresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == idEmpresa) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPorId(Integer idEmpresa) {
		for (Empresa empresa : listEmpresas) {
			if(empresa.getId() == idEmpresa) {
				return empresa;
			}
		}
		
		return null;
	}

	public Usuario buscaUsuario(String login, String senha) {
		for (Usuario usuario : listUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
	
}
