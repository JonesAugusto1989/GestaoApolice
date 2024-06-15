package br.edu.infnet.AppJones.model.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TSeguradora")
public class Seguradora {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String cpf_cnpj;
	private String nome;
	private String email;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idSegurador")
	private List<Apolice> apolices;
	
 
	
	public Seguradora() {
		this.apolices = new ArrayList<Apolice>();
	}
	
	public Seguradora(Integer id) {
		this();
		this.id = id;
		
	}
	
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
		return "Seguradora [id=" + id + ", cpf_cnpj=" + cpf_cnpj + ", nome=" + nome + ", email=" + email + ", apolices="
				+ apolices.size() + "]";
	}
	
	
	
	
}
