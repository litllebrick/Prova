package br.edu.univas.main;

import br.edu.univas.vo.Estabelecimento;
import br.edu.univas.vo.Cardapio;
import java.util.ArrayList;

public class StartApp {

	public static void main(String[] args) {

		ArrayList <Estabelecimento> lista;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome do Estabelecimento: ");
			lista.add(addCardapio());
		}
	}

}
