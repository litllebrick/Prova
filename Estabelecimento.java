package br.edu.univas.vo;

import java.util.ArrayList;

public class Estabelecimento {

	private String nome;
	private ArrayList<Cardapio> cardapio;

	Cardapio addCardapio(Cardapio xuxa) {
		return xuxa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Cardapio> getCardapio() {
		return cardapio;
	}

	public void setCardapio(ArrayList<Cardapio> cardapio) {
		this.cardapio = cardapio;
	}

}
