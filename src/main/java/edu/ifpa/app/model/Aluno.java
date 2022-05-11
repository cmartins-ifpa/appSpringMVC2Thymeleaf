package edu.ifpa.app.model;

import java.io.Serializable;

public class Aluno implements Serializable{
	private Integer id;
    private String nome;
    
    public Aluno() {} // construtor vazio
    
    public Aluno(Integer id, String name) {
		// construtor com inicializacao 
		this.id = id;
		this.nome = name;
	}
	// standard getters and setters
   
    
    private static final long serialVersionUID = 1L;    
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}
    
}
