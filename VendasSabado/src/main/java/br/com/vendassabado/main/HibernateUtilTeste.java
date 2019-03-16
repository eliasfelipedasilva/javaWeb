package br.com.vendassabado.main;

import org.hibernate.Session;

import br.com.vendassabado.util.hibernateUtil;

public class HibernateUtilTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session sessao = hibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		hibernateUtil.getFabricaDeSessoes().close();
	}
}
