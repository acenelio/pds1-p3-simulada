package dao;

import java.util.List;

import dominio.ItemPedido;

public interface ItemPedidoDao {

	public void inserirAtualizar(ItemPedido x);
	public void excluir(ItemPedido x);
	public ItemPedido buscar(int x);
	public List<ItemPedido> buscarTodos();
}

