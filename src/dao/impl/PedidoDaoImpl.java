package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.PedidoDao;
import dominio.Pedido;

public class PedidoDaoImpl implements PedidoDao {

	private EntityManager em;
	
	public PedidoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Pedido x) {
		if (x.getCodPedido() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}
	
	@Override
	public void excluir(Pedido x) {
		x = em.merge(x);
		em.remove(x);
	}
	
	@Override
	public Pedido buscar(int codPedido) {
		return em.find(Pedido.class, codPedido);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pedido> buscarTodos() {
		String jpql = "SELECT x FROM Pedido x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
}
