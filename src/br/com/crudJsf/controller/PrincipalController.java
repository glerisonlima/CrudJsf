package br.com.crudJsf.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="principalController")
public class PrincipalController {

	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public PrincipalController() {
		mensagem = "Bem Vindo ao meu Crud com JSF";
	}
}
