package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Carro extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = -8294173180190622560L;

	private String titulo;
	private String modelo;
	private String anos_uso;
	private String cor;
	private String valor;
}
