package br.com.vendassabado.dao;

import org.junit.Ignore;
import org.junit.Test;
import java.util.List;
import br.com.vendassabado.domain.Fornecedores;

public class FornecedorDaoTest {
	
	@Ignore
	@Test
	public void salvar() {
		//instanciação de objetos referente ao fornecedor, para salvar no banco de dados
		Fornecedores fornecedor = new Fornecedores();
		
		//Prenchimento do campo respectivo à tabela 'Fornecedores'
		fornecedor.setNome("Exemplo");
		
		//Realização da inserção no banco de dados
		FornecedoresDao fornecedorDao = new FornecedoresDao();
		fornecedorDao.salvar(fornecedor);
		
		//Menssagem de sucesso
		System.out.println("Êxito no cadastro do fornecedor");
	}
	
	@Test
	public void listar() {
		FornecedoresDao fornecedoresDao = new FornecedoresDao();
		List<Fornecedores> resultado = fornecedoresDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		
		for (Fornecedores fornecedores : resultado) {
			System.out.println(fornecedores.getNome());
		}
	}
	
	@Test
	public void buscar() {
		long codigo = 2L;
		
		FornecedoresDao fornecedoresDao = new FornecedoresDao();
		Fornecedores fornecedores = fornecedoresDao.buscar(codigo);
		
		if (fornecedores == null) {
			System.out.println("Nenhum Registro Encontrado");
		
		} else {
			System.out.println("Registro Encontrado");
			System.out.println(fornecedores.getNome());
		}
		
		
		
	}

}
