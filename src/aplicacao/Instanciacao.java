package aplicacao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dominio.ItemPedido;
import dominio.Pedido;
import dominio.Produto;
import servico.ItemPedidoServico;
import servico.PedidoServico;
import servico.ProdutoServico;
import servico.ServicoFactory;

public class Instanciacao {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Produto p1 = new Produto(null, "Estojo", new BigDecimal("30.00"));
		Produto p2 = new Produto(null, "Caderno", new BigDecimal("20.00"));
		Produto p3 = new Produto(null, "Lapis de cor", new BigDecimal("40.00"));
		Produto p4 = new Produto(null, "Regua", new BigDecimal("10.00"));
		Produto p5 = new Produto(null, "Pasta", new BigDecimal("15.00"));

		Pedido pe1 = new Pedido(null, sdf.parse("10/11/2015"));
		Pedido pe2 = new Pedido(null, sdf.parse("15/11/2015"));
		Pedido pe3 = new Pedido(null, sdf.parse("20/11/2015"));
		Pedido pe4 = new Pedido(null, sdf.parse("25/11/2015"));
		Pedido pe5 = new Pedido(null, sdf.parse("05/12/2015"));
	
		ItemPedido ip1 = new ItemPedido(null, 2, pe1, p3);
		ItemPedido ip2 = new ItemPedido(null, 3, pe1, p4);
		ItemPedido ip3 = new ItemPedido(null, 2, pe2, p2);
		ItemPedido ip4 = new ItemPedido(null, 2, pe2, p5);
		ItemPedido ip5 = new ItemPedido(null, 4, pe3, p1);
		ItemPedido ip6 = new ItemPedido(null, 2, pe3, p2);
		ItemPedido ip7 = new ItemPedido(null, 3, pe4, p5);
		ItemPedido ip8 = new ItemPedido(null, 2, pe4, p3);
		ItemPedido ip9 = new ItemPedido(null, 2, pe5, p4);
		ItemPedido ip10 = new ItemPedido(null, 2, pe5, p1);
		
		ProdutoServico ps = ServicoFactory.criarProdutoServico();
		PedidoServico pes = ServicoFactory.criarPedidoServico();
		ItemPedidoServico ips = ServicoFactory.criarItemPedidoServico();
		
		ps.inserirAtualizar(p1);
		ps.inserirAtualizar(p2);
		ps.inserirAtualizar(p3);
		ps.inserirAtualizar(p4);
		ps.inserirAtualizar(p5);
		
		pes.inserirAtualizar(pe1);
		pes.inserirAtualizar(pe2);
		pes.inserirAtualizar(pe3);
		pes.inserirAtualizar(pe4);
		pes.inserirAtualizar(pe5);

		ips.inserirAtualizar(ip1);
		ips.inserirAtualizar(ip2);
		ips.inserirAtualizar(ip3);
		ips.inserirAtualizar(ip4);
		ips.inserirAtualizar(ip5);
		ips.inserirAtualizar(ip6);
		ips.inserirAtualizar(ip7);
		ips.inserirAtualizar(ip8);
		ips.inserirAtualizar(ip9);
		ips.inserirAtualizar(ip10);
		
		System.out.println("Pronto!");
	}

}
