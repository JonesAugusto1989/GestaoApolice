package br.edu.infnet.AppJones.model.domain;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="TApoliceVida")
public class ApoliceVida extends Apolice{
	
	private boolean Internacional;
	private List<String> cobertura;
	
	
	
	
	
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
	public List<String> getCobertura() {
		return cobertura;
	}
	public void setCobertura(List<String> cobertura) {
		this.cobertura = cobertura;
	}


}
