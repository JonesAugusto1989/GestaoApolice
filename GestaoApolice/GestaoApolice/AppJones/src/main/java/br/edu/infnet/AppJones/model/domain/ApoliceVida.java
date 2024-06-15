package br.edu.infnet.AppJones.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="TApoliceVida")
public class ApoliceVida extends Apolice{
	
	private boolean Internacional;
	
	
	private String cobertura;
	
	
	
	
	
	@Override
	public String toString() {
		return super.toString()+"ApoliceVida [Internacional=" + Internacional + ", cobertura=" + cobertura + "]";
	}
	public boolean isInternacional() {
		return Internacional;
	}
	public void setInternacional(boolean internacional) {
		Internacional = internacional;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}


}
