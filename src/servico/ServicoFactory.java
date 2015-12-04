package servico;

import servico.impl.ItemPedidoServicoImpl;
import servico.impl.PedidoServicoImpl;
import servico.impl.ProdutoServicoImpl;

public class ServicoFactory {

	public static ItemPedidoServico criarItemPedidoServico() {
		return new ItemPedidoServicoImpl();
	}
	
	public static PedidoServico criarPedidoServico() {
		return new PedidoServicoImpl();
	}
	
	public static ProdutoServico criarProdutoServico() {
		return new ProdutoServicoImpl();
	}
	
}