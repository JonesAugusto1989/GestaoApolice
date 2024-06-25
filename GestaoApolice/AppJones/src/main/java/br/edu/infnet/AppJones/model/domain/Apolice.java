package br.edu.infnet.AppJones.model.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TApolice")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Apolice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id = 0;

	@NotBlank(message = "É necessario preencher o campo tipoSeguro")
	@Column(name = "dsTipoSeguro")
	private String tipoSeguro;

	@NotBlank(message = "É necessario preencher o campo beneficiario")
	@Size(min = 3, max = 90)
	@Column(name = "dsBeneficiario")
	private String beneficiario;

	@NotBlank(message = "É necessario preencher o campo numeroDaApolice")
	private String numeroDaApolice;

	@NotBlank(message = "É necessario preencher o campo SeguradoraContratada")
	private String SeguradoraContratada;

	@NotNull(message = "A data de vigencia não pode ser nula")
	private LocalDate vigenciaInicial;

	@NotNull(message = "A data de vigencia não pode ser nula")
	private LocalDate vigenciaFinal;

	@Min(value = 1)
	@Column(name = "vlValor")
	private float valor;

	@ManyToOne
	@JoinColumn(name = "idSegurador")
	@JsonBackReference
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



	public String getNumeroDaApolice() {
		return numeroDaApolice;
	}

	public void setNumeroDaApolice(String numeroDaApolice) {
		this.numeroDaApolice = numeroDaApolice;
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
		LocalDate localVigenciaInicial = LocalDate.parse(vigenciaInicial, formatador);
		this.vigenciaInicial = localVigenciaInicial;
	}

	public LocalDate getVigenciaFinal() {
		return vigenciaFinal;
	}

	public void setVigenciaFinal(String vigenciaFinal) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localVigenciaFinal = LocalDate.parse(vigenciaFinal, formatador);
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
		return "Apolice: id = " + id + "[Benificiario= " + beneficiario + ", Numero da Apolice=" + numeroDaApolice
				+ ", SeguradoraContratada=" + SeguradoraContratada + ", valor=" + valor + "]";
	}

}
