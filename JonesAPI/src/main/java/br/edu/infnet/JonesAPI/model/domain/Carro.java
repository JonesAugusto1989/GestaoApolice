package br.edu.infnet.JonesAPI.model.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Carro {
	   
	@JsonProperty("make")
	private String fabricante;
	
	@JsonProperty("model")
	private String modelo;
	
	@JsonProperty("year")
	private String anoDeFabricacao;
	
	@JsonProperty("class")
	private String tamanho;
	
	@JsonProperty("drive")
	private String tracao;
	
	@JsonProperty("fuel_type")
	private String tipoCombustivel;
		
	@JsonProperty("transmission")
	private String transmissao;
		
	@JsonProperty("cylinders")
	private String cilindros;
	
	

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}

	public String getCilindros() {
		return cilindros;
	}

	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}

	@Override
	public String toString() {
		return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", anoDeFabricacao=" + anoDeFabricacao
				+ ", tamanho=" + tamanho + ", tracao=" + tracao + ", tipoCombustivel=" + tipoCombustivel
				+ ", transmissao=" + transmissao + ", cilindros=" + cilindros + "]";
	}
	
	
	
	
	
	
}
