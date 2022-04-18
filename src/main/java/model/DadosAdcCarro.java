package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class DadosAdcCarro extends DefaultEntity implements Serializable{
	private static final long serialVersionUID = -5904198334994196821L;
	private String num_serie;
	private String ano_fablicacao;
	private String final_placa;
	private String km_rodados;
	
	public String getNum_serie() {
		return num_serie;
	}
	public void setNum_serie(String num_serie) {
		this.num_serie = num_serie;
	}
	
	public String getAno_fablicacao() {
		return ano_fablicacao;
	}
	public void setAno_fablicacao(String ano_fablicacao) {
		this.ano_fablicacao = ano_fablicacao;
	}
	public String getFinal_placa() {
		return final_placa;
	}
	public void setFinal_placa(String final_placa) {
		this.final_placa = final_placa;
	}
	public String getKm_rodados() {
		return km_rodados;
	}
	public void setKm_rodados(String km_rodados) {
		this.km_rodados = km_rodados;
	}
	
	
}
