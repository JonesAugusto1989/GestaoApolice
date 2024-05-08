package br.edu.infnet.AppJones.model.domain;

import java.util.List;

public class Seguradora {

	private Integer id;
	private String cpf_cnpj;
	private String nome;
	private String email;
	private List<Apolice> apolices;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public List<Apolice> getApolices() {
		return apolices;
	}
	public void setApolices(List<Apolice> apolices) {
		this.apolices = apolices;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return  "Segurador " + " nome=" + nome ;
	}
	
	
	
}
