package com.firstjsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.firstjsf.domain.Cliente;

@ManagedBean
public class ConsultaClienteBean {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void consultar() {
		this.getClientes().add(new Cliente(1, "Rei Ayanami", "Tokyo"));
		this.getClientes().add(new Cliente(2, "Shinji Ikari", "Chiba"));
		this.getClientes().add(new Cliente(4, "Asuka Langley", "Nagoya"));
		this.getClientes().add(new Cliente(6, "Misato Katsuragi", "Osaka"));
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
}
