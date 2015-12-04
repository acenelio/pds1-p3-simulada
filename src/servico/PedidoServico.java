package servico;

import java.util.List;

import dominio.Pedido;

public interface PedidoServico {
	
	public void inserirAtualizar(Pedido x);
	public void excluir(Pedido x);
	public Pedido buscar(int cod);
	public List<Pedido> buscarTodos();
	
}
