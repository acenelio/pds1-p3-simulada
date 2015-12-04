package dao;

import java.util.List;

import dominio.Pedido;

public interface PedidoDao {

	public void inserirAtualizar(Pedido x);
	public void excluir(Pedido x);
	public Pedido buscar(int x);
	public List<Pedido> buscarTodos();
}

