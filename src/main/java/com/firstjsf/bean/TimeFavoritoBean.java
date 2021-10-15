package com.firstjsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimeFavoritoBean {

	private String time;
	
	public void escolher() {
		System.out.println("Time escolhido: " + this.getTime());
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
