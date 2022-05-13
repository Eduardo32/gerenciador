package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listEmpresas = new ArrayList<>();
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
	
}
