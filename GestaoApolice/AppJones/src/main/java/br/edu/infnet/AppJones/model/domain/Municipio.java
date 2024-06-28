package br.edu.infnet.AppJones.model.domain;

public class Municipio {
	
	private Integer id;
	private String nome;
	
	public Municipio() {
		this.setId(1);
		
	}
	
	public Municipio( String nome) {
		this();
		this.setNome(nome);
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		
		return String.format("%d -%s", id, nome);
	}

}
