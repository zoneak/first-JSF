package com.firstjsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroBean {

	private String vaga = "A320";
	private String cargo = "Desenvolvedor java";

	public String getVaga() {
		return vaga;
	}

	public void setVaga(String vaga) {
		this.vaga = vaga;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
