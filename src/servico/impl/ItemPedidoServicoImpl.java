package servico.impl;

import java.util.List;

import dao.impl.EM;
import dao.DaoFactory;

import dao.ItemPedidoDao;

import dominio.ItemPedido;
import servico.ItemPedidoServico;

public class ItemPedidoServicoImpl implements ItemPedidoServico {

	private ItemPedidoDao dao;
	
	public ItemPedidoServicoImpl() {
		dao = DaoFactory.criarItemPedidoDao();
	}
	
	@Override
	public void inserirAtualizar(ItemPedido x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(ItemPedido x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public ItemPedido buscar(int codItemPedido) {
		return dao.buscar(codItemPedido);
	}

	@Override
	public List<ItemPedido> buscarTodos() {
		return dao.buscarTodos();
	}
	
}