package com.firstjsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.firstjsf.domain.Cliente;

@ManagedBean
@ViewScoped
public class ConsultaClienteBean {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void consultar() {
		this.getClientes().add(new Cliente(1, "Rei Ayanami", "Tokyo"));
		this.getClientes().add(new Cliente(2, "Shinji Ikari", "Chiba"));
		this.getClientes().add(new Cliente(4, "Asuka Langley", "Nagoya"));
		this.getClientes().add(new Cliente(6, "Misato Katsuragi", "Osaka"));
	}
	
	public void salvar() {
		for (Cliente c : this.getClientes()) {
			System.out.println(c.getCodigo() + " - " + c.getNome());
		}
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
}
