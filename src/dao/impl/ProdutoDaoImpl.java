package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ProdutoDao;
import dominio.Produto;

public class ProdutoDaoImpl implements ProdutoDao {

	private EntityManager em;
	
	public ProdutoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Produto x) {
		if (x.getCodProduto() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}
	
	@Override
	public void excluir(Produto x) {
		x = em.merge(x);
		em.remove(x);
	}
	
	@Override
	public Produto buscar(int codProduto) {
		return em.find(Produto.class, codProduto);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Produto> buscarTodos() {
		String jpql = "SELECT x FROM Produto x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
}
