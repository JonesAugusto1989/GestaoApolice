package br.edu.infnet.AppJones.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="TApoliceAuto")
public class ApoliceAuto extends Apolice{
	
	private String numeroDaApolice;
	private String placa;
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
