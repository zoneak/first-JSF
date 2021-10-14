package com.firstjsf.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import com.firstjsf.domain.Produto;

@ManagedBean
@SessionScoped
public class GestaoProdutosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Produto produto;
	private List<Produto> produtos;
	private List<Produto> produtosFiltrados;
	private Produto produtoSelecionado;
	private String nomePesquisa;
	
	public GestaoProdutosBean() {
		this.produto = new Produto();
		this.produtos = new ArrayList<Produto>();
		this.produtosFiltrados = new ArrayList<Produto>();
	}
	
	public void nomePesquisaAlterado(ValueChangeEvent event) {
		System.out.println("Evento de mudança de valor...");
		System.out.println("Valor atual: " + this.nomePesquisa);
		System.out.println("Novo valor: " + event.getNewValue());
		
		this.produtosFiltrados.clear();
		for (Produto produto : this.produtos) {
			if (produto.getNome() != null && produto.getNome().startsWith(event.getNewValue().toString())) {
				this.produtosFiltrados.add(produto);
			}
		}
	}
	
	public String obterAjuda() {
		if (this.produtos.isEmpty()) {
			return "AjudaGestaoProdutos?faces-redirect=true";
		} else return "AjudaGestaoProdutosTelefone?faces-redirect=true";
	}
	
	public void verificarInclusao(ActionEvent event) {
		System.out.println("Verificando...");
		if ("".equals(produto.getFabricante())) {
			this.produto.setFabricante("Sem fabricante");
		}
	}
	
	public void incluir() {
		System.out.println("Incluindo...");
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}
	
	public void excluir() {
		this.produtos.remove(this.produtoSelecionado);
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}
	
	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
	
	public String getNomePesquisa() {
		return nomePesquisa;
	}
	
	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}
	
	public List<Produto> getProdutosFiltrados() {
		return produtosFiltrados;
	}
}
