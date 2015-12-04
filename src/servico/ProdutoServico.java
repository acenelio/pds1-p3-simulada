package servico;

import java.util.List;

import dominio.Produto;

public interface ProdutoServico {
	
	public void inserirAtualizar(Produto x);
	public void excluir(Produto x);
	public Produto buscar(int cod);
	public List<Produto> buscarTodos();
	
}
