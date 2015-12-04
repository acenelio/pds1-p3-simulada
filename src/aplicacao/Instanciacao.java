package aplicacao;

import java.math.BigDecimal;

import dominio.Produto;
import servico.ProdutoServico;
import servico.ServicoFactory;

public class Instanciacao {

	public static void main(String[] args) {

		Produto p1 = new Produto(null, "Estojo", new BigDecimal("30.00"));
		Produto p2 = new Produto(null, "Caderno", new BigDecimal("20.00"));
		Produto p3 = new Produto(null, "Lapis de cor", new BigDecimal("40.00"));
		Produto p4 = new Produto(null, "Regua", new BigDecimal("10.00"));
		Produto p5 = new Produto(null, "Pasta", new BigDecimal("15.00"));

		ProdutoServico ps = ServicoFactory.criarProdutoServico();
		
		ps.inserirAtualizar(p1);
		ps.inserirAtualizar(p2);
		ps.inserirAtualizar(p3);
		ps.inserirAtualizar(p4);
		ps.inserirAtualizar(p5);
		
		System.out.println("Pronto!");
	}

}
