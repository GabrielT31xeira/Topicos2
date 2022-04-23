package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Usuario extends DefaultEntity implements Serializable{
	
	private static final long serialVersionUID = -2828223166739295713L;
	@Column(length = 60)
	private String nome;
	@Column(length = 60)
	private String email;
	@Column(length = 11)
	private String cpf;
	@Column(length = 30)
	private String senha;
	private String data_nasc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
}
