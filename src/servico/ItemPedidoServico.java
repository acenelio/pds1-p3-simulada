package servico;

import java.util.List;

import dominio.ItemPedido;

public interface ItemPedidoServico {
	
	public void inserirAtualizar(ItemPedido x);
	public void excluir(ItemPedido x);
	public ItemPedido buscar(int cod);
	public List<ItemPedido> buscarTodos();
	
}
