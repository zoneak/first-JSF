package com.firstjsf.home;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void enviar() {
		this.setNome(this.getNome().toUpperCase());
	}
}
