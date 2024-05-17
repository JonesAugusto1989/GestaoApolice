package br.edu.infnet.AppJones.model.domain;

public class ApoliceAuto extends Apolice{
	
	private String numero;
	private String placa;
	private int bonusApolice;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
		return super.toString()+" ApoliceAuto [placa=" + placa + ", numero=" +numero
				 + "]";
	}

	
}
