package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Carro implements Serializable{
	private static final long serialVersionUID = -1137065123481216298L;
	
	@Id
	private Integer id;
	private String marca;
	private String modelo;
	private String placa;
	private String numero_serie;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}
	
}
