package dao;

import dao.impl.ItemPedidoDaoImpl;
import dao.impl.PedidoDaoImpl;
import dao.impl.ProdutoDaoImpl;

public class DaoFactory {

	public static PedidoDao criarPedidoDao() {
		return new PedidoDaoImpl();
	}
	
	public static ItemPedidoDao criarItemPedidoDao() {
		return new ItemPedidoDaoImpl();
	}
	
	public static ProdutoDao criarProdutoDao() {
		return new ProdutoDaoImpl();
	}
	 
}
