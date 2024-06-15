package br.edu.infnet.AppJones.model.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TApolice")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Apolice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id = 0;
	private String tipoSeguro;
	private String beneficiario;
	private String apoliceContratante;
	private String SeguradoraContratada;
	private LocalDate vigenciaInicial;
	private LocalDate vigenciaFinal;
	private float valor;
	@ManyToOne
	@JoinColumn(name = "idSegurador")
	
	
	private Seguradora segurado;
	
	public Seguradora getSegurado() {
		return segurado;
	}


	public void setSegurado(Seguradora segurado) {
		this.segurado = segurado;
	}


	public Apolice() {
		id++;
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTipoSeguro() {
		return tipoSeguro;
	}


	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}


	public String getBeneficiario() {
		return beneficiario;
	}


	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
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


	public void setVigenciaInicial(String vigenciaInicial) {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localVigenciaInicial = LocalDate.parse(vigenciaInicial,formatador);
		this.vigenciaInicial = localVigenciaInicial;
	}


	public LocalDate getVigenciaFinal() {
		return vigenciaFinal;
	}


	public void setVigenciaFinal(String vigenciaFinal) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localVigenciaFinal = LocalDate.parse(vigenciaFinal,formatador);
		this.vigenciaFinal = localVigenciaFinal;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Apolice: id = "+id +"[Benificiario= "+ beneficiario +", apoliceContratante=" + apoliceContratante + ", SeguradoraContratada=" + SeguradoraContratada
				+ ", valor=" + valor + "]";
	}
	
	

}
