package br.edu.infnet.AppJones.model.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TSeguradora")
public class Seguradora {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true,name="csCpfCnpj")
	private String cpfCnpj;
	
	@NotBlank(message = "É necessario preencher o campo nome")
	@Size(min = 3,max = 100)
	@Column(name="dsNome")
	private String nome;
	
	@Email(message = "Email tem que ser valido")
	private String email;
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JsonManagedReference
	@JoinColumn(name = "idSegurador")
	private List<Apolice> apolices;
	
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="idEndereco")
	private Endereco endereco;
	
 
	
	public Seguradora() {
		this.apolices = new ArrayList<Apolice>();
		this.endereco = new Endereco();
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
		return cpfCnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpfCnpj = cpf_cnpj;
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
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	

	@Override
	public String toString() {
		return "Seguradora [id=" + id + ", cpfCnpj=" + cpfCnpj + ", nome=" + nome + ", email=" + email + ", apolices="
				+ apolices + ", endereco=" + endereco + "]";
	}


	
	
	
}
