package edu.ifpa.app.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ifpa.app.model.Aluno;
 
@Controller
public class ControladorApp {
	
	@RequestMapping("/home-app")
	public String homeApp(
			@ModelAttribute("bean") ModelMap model,
			HttpServletRequest request) {
	    model.addAttribute("horasistema", new Date().toLocaleString());
	    String nome = request.getParameter("nome");
	    if (nome==null) nome = "";
	    model.addAttribute("usuario", nome);
	    
	    return "homepage-app";
	}
	
	
	@RequestMapping("/alunos-lista")
	public String alunosLista (
			@ModelAttribute("bean") ModelMap model) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		// simula a criação de uma lista de alunos 
		alunos.add(new Aluno(202201, "MARIA JOSÉ"));
		alunos.add(new Aluno(202202, "ANTONIA SANTOS"));
		alunos.add(new Aluno(202203, "JOSÉ BONIFÁCIO"));
		alunos.add(new Aluno(202204, "PEDRO ANTÔNIO"));
		alunos.add(new Aluno(202205, "LUISA MAGALU"));
		
		model.addAttribute("alunos", alunos);
		
		return "lista-alunos";
	}
}
