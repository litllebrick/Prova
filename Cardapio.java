package br.edu.univas.vo;

import java.util.ArrayList;

public class Cardapio {

	private String nome;
	private ArrayList <String> itens;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getItens() {
		return itens;
	}
	public void setItens(ArrayList<String> itens) {
		this.itens = itens;
	}
}


