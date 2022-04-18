package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Compra extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = -5956633793736643436L;

	private String titulo;
	private String modelo;
	private String anos_uso;
	private String cor;
	private String valor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnos_uso() {
		return anos_uso;
	}
	public void setAnos_uso(String anos_uso) {
		this.anos_uso = anos_uso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
}
