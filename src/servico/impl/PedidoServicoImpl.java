package servico.impl;

import java.util.List;

import dao.impl.EM;
import dao.DaoFactory;

import dao.PedidoDao;

import dominio.Pedido;
import servico.PedidoServico;

public class PedidoServicoImpl implements PedidoServico {

	private PedidoDao dao;
	
	public PedidoServicoImpl() {
		dao = DaoFactory.criarPedidoDao();
	}
	
	@Override
	public void inserirAtualizar(Pedido x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(Pedido x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Pedido buscar(int codPedido) {
		return dao.buscar(codPedido);
	}

	@Override
	public List<Pedido> buscarTodos() {
		return dao.buscarTodos();
	}
	
}