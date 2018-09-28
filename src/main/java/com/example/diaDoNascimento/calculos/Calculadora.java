package com.example.diaDoNascimento.calculos;

public class Calculadora {
	
	private Integer diaNascimento;
	protected Integer mesNascimento;
	private Integer anoNascimento;
	public String mes;
	
	
	public  String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public Integer getDiaNascimento() {
		return diaNascimento;
	}
	
	public void setDiaNascimento(Integer diaNascimento) {
		if(diaNascimento!=null) {
		this.diaNascimento = diaNascimento;
		}
	}
	public Integer getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(Integer mesNascimento) {
		this.mesNascimento = mesNascimento;
	
	}
	
	public Integer getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	

}
