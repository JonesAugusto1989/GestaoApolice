package br.edu.infnet.AppJones.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Carro {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	   	private int id;

		@JsonProperty("make")
		@Column(name="dcFabricante")
		private String fabricante;
		
		@JsonProperty("model")
		@Column(name="dsModelo")
		@Size(min = 2,max = 40)
		private String modelo;

		@JsonProperty("year")
		@Column(name="dsAnoDeFabricacao")
		@Size(min = 4, max = 4)
		private String anoDeFabricacao;
			
		@JsonProperty("class")
		@Column(name="dsTamanho")
		@Size(min = 4,max = 40)
		private String tamanho;
		
		@JsonProperty("drive")
		@Column(name="dsTracao")
		@Size(min = 2,max = 10)
		private String tracao;
		
		@JsonProperty("fuel_type")
		@Column(name="dsTipoCombustivel")
		private String tipoCombustivel;
					
		@JsonProperty("transmission")
		@Column(name="dsTransmissao")
		private String transmissao;
				
		@JsonProperty("cylinders")
		@Column(name="dsCilindros")
		@Size(min = 1,max = 4)
		private String cilindros;
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

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
			return "Carro [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", anoDeFabricacao="
					+ anoDeFabricacao + ", tamanho=" + tamanho + ", tracao=" + tracao + ", tipoCombustivel="
					+ tipoCombustivel + ", transmissao=" + transmissao + ", cilindros=" + cilindros + "]";
		}
		
		
		
		
		
}
