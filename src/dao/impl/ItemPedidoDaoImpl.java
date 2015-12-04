package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ItemPedidoDao;
import dominio.ItemPedido;

public class ItemPedidoDaoImpl implements ItemPedidoDao {

	private EntityManager em;
	
	public ItemPedidoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(ItemPedido x) {
		if (x.getCodItemPedido() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}
	
	@Override
	public void excluir(ItemPedido x) {
		x = em.merge(x);
		em.remove(x);
	}
	
	@Override
	public ItemPedido buscar(int codItemPedido) {
		return em.find(ItemPedido.class, codItemPedido);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ItemPedido> buscarTodos() {
		String jpql = "SELECT x FROM ItemPedido x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
}
