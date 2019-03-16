package br.com.vendassabado.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.vendassabado.util.hibernateUtil;

public class GenericDao<Entidade> {

	private Class<Entidade> classe;

	public GenericDao() {
		this.classe = (Class<Entidade>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}


	// METODO DE SALVAR DADOS
	public void salvar(Entidade entidade) {
		Session sessao = hibernateUtil.getFabricaDeSessoes().openSession();

		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();

			sessao.save(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}
	}

	public List<Entidade> listar() {

		Session sessao = hibernateUtil.getFabricaDeSessoes().openSession();

		try {

			Criteria consulta = sessao.createCriteria(classe);

			List<Entidade> resultado = consulta.list();
			
			return resultado;

		} catch (RuntimeException erro) {

			throw erro;

		} finally {
			
			sessao.close();
			
		}
		
	}
	
	public Entidade buscar(long codigo) {

		Session sessao = hibernateUtil.getFabricaDeSessoes().openSession();

		try {

			Criteria consulta = sessao.createCriteria(classe);
			
			consulta.add(Restrictions.idEq(codigo));

			Entidade resultado = (Entidade) consulta.uniqueResult();
			
			
			return resultado;

		} catch (RuntimeException erro) {

			throw erro;

		} finally {
			
			sessao.close();
			
		}
		
	}

}
