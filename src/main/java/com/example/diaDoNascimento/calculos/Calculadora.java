package com.example.diaDoNascimento.calculos;

public class Calculadora {
	
	private Integer diaNascimento;
	private Integer mesNascimento;
	private Integer anoNascimento;
	private String mes;
	
	
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(Integer diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public int getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(Integer mesNascimento) {
		this.mesNascimento = mesNascimento;
			
		
		if(mesNascimento == 1) {
			this.setMes("Janeiro");
		}
		if(mesNascimento == 2) {
			this.setMes("Fevereiro");
		}
		if(mesNascimento == 3) {
			this.setMes("Março");
		}
		if(mesNascimento == 4) {
			this.setMes("Abril");
		}
		if(mesNascimento == 5) {
			this.setMes("Maio");
		}
		if(mesNascimento == 6) {
			this.setMes("Junho");
		}
		if(mesNascimento == 7) {
			this.setMes("Julho");
		}
		if(mesNascimento == 8) {
			this.setMes("Agosto");
		}
		if(mesNascimento == 9) {
			this.setMes("Setembro");
		}
		if(mesNascimento == 10) {
			this.setMes("Outubro");
		}
		if(mesNascimento == 11) {
			this.setMes("Novembro");
		}
		if(mesNascimento == 12) {
			this.setMes("Dezembro");
		}
		if(mesNascimento <1 || mesNascimento > 12 || mesNascimento ==null) {
			this.setMes("mes invalido");
		}
	
		
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	

}
