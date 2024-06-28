package br.edu.infnet.AppJones.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="TApoliceAuto")
public class ApoliceAuto extends Apolice{
	
	//@NotBlank(message = "É necessario preencher o campo marcaDoCarro")
	//private String marcaDoCarro;
	
	
	@Column(name = "csPlaca")
	@NotBlank(message = "É necessario preencher o campo placa")
	private String placa;
	
	@Column(name = "csBonusApolice")
	
	private int bonusApolice;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idCarro")
	private Carro carro;
	
	
	public ApoliceAuto() {
	//	this.carro = new Carro();
	}
	

	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	

	public int getBonusApolice() {
		return bonusApolice;
	}
	public void setBonusApolice(int bonusApolice) {
		this.bonusApolice = bonusApolice;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public String toString() {
		return super.toString()+" ApoliceAuto [placa=" + placa + ", Carro:" + carro+
				  "]";
	}

	
}
