package servico.impl;

import java.util.List;

import dao.impl.EM;
import dao.DaoFactory;

import dao.ProdutoDao;

import dominio.Produto;
import servico.ProdutoServico;

public class ProdutoServicoImpl implements ProdutoServico {

	private ProdutoDao dao;
	
	public ProdutoServicoImpl() {
		dao = DaoFactory.criarProdutoDao();
	}
	
	@Override
	public void inserirAtualizar(Produto x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(Produto x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Produto buscar(int codProduto) {
		return dao.buscar(codProduto);
	}

	@Override
	public List<Produto> buscarTodos() {
		return dao.buscarTodos();
	}
	
}