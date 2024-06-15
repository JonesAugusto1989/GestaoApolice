package br.edu.infnet.AppJones.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="TApoliceVida")
public class ApoliceVida extends Apolice{
	
	@Column(name = "flInternacional")
	private boolean Internacional;

	@Size(min = 5)
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
