package br.edu.infnet.AppJones.model.domain;

import java.util.List;

public class ApoliceVida extends Apolice{
	
	private List<String> cobertura;
	private boolean nacionalInternacional;
	
	
	@Override
	public String toString() {
		return super.toString()+" ApoliceVida [cobertura=" + cobertura + ", nacionalInternacional=" + nacionalInternacional + "]";
	}
	public List<String> getCobertura() {
		return cobertura;
	}
	public void setCobertura(List<String> cobertura) {
		this.cobertura = cobertura;
	}
	public boolean isNacionalInternacional() {
		return nacionalInternacional;
	}
	public void setNacionalInternacional(boolean nacionalInternacional) {
		this.nacionalInternacional = nacionalInternacional;
	}

}
