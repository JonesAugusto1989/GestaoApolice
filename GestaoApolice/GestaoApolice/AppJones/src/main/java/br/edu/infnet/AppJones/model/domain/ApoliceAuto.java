package br.edu.infnet.AppJones.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="TApoliceAuto")
public class ApoliceAuto extends Apolice{
	
	@NotBlank(message = "É necessario preencher o campo numeroDaApolice")
	private String numeroDaApolice;
	
	
	@Column(name = "csPlaca")
	@NotBlank(message = "É necessario preencher o campo placa")
	private String placa;
	
	@Column(name = "csBonusApolice")
	
	private int bonusApolice;
	

	public String getNumeroDaApolice() {
		return numeroDaApolice;
	}
	public void setNumeroDaApolice(String numeroDaApolice) {
		this.numeroDaApolice = numeroDaApolice;
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
		return super.toString()+" ApoliceAuto [placa=" + placa + ", numero=" + numeroDaApolice
				 + "]";
	}

	
}
