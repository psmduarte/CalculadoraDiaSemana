package com.example.diaDoNascimento.calculos;

public class CalculoMes extends Calculadora {
	
	@Override
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

	
	
}
