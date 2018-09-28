package com.example.diaDoNascimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.diaDoNascimento.calculos.Calculadora;
import com.example.diaDoNascimento.calculos.CalculoMes;

@Controller
@RequestMapping("/calculadora")
public class DiaControlador {
	
	@RequestMapping(value= {"/", ""}, method = RequestMethod.GET)
	public ModelAndView carregaCalc(Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return new ModelAndView("calculadora");
	}
	
	@RequestMapping(value= {"/", ""}, method = RequestMethod.POST)
	public ModelAndView recebeCalc(@ModelAttribute("calculadora") Calculadora calculadora,CalculoMes calculoMes, Model model) {
		model.addAttribute("obj", "Voce nasceu no dia: " + calculadora.getDiaNascimento() + "<br>"
							+ "Voce nasceu no mes:  " + calculoMes.getMes() + "<br>" 
							+ "Voce nasceu no ano: " + calculadora.getAnoNascimento());
		return new ModelAndView("calculadora");
	}
	


}
