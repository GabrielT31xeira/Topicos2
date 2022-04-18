package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Telefone extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = 7737688903896203811L;
	
	private String numero;
	private String ddd;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	
	
}
