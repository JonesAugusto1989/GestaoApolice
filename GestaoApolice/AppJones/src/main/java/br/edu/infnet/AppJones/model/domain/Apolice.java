package br.edu.infnet.AppJones.model.domain;

import java.time.LocalDate;

public abstract class Apolice {
	
	private Integer id;
	private String apoliceContratante;
	private String SeguradoraContratada;
	private LocalDate vigenciaInicial;
	private LocalDate vigenciaFinal;
	private float valor;
	private String tipoSeguro;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getApoliceContratante() {
		return apoliceContratante;
	}
	public void setApoliceContratante(String apoliceContratante) {
		this.apoliceContratante = apoliceContratante;
	}
	public String getSeguradoraContratada() {
		return SeguradoraContratada;
	}
	public void setSeguradoraContratada(String seguradoraContratada) {
		SeguradoraContratada = seguradoraContratada;
	}
	public LocalDate getVigenciaInicial() {
		return vigenciaInicial;
	}
	public void setVigenciaInicial(LocalDate vigenciaInicial) {
		this.vigenciaInicial = vigenciaInicial;
	}
	public LocalDate getVigenciaFinal() {
		return vigenciaFinal;
	}
	public void setVigenciaFinal(LocalDate vigenciaFinal) {
		this.vigenciaFinal = vigenciaFinal;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getTipoSeguro() {
		return tipoSeguro;
	}
	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	@Override
	public String toString() {
		return "Apolice [apoliceContratante=" + apoliceContratante + ", SeguradoraContratada=" + SeguradoraContratada
				+ ", valor=" + valor + "]";
	}
	
	

}
