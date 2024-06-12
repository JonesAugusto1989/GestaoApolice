package br.edu.infnet.AppJones.model.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

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
