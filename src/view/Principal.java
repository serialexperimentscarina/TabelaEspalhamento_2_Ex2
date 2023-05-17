package view;

import controller.TabelaParImpar;

public class Principal {

	public static void main(String[] args) {
		TabelaParImpar tabela = new TabelaParImpar();
		
		// Gerar um vetor de teste com números aleatórios
		int n = (int) ((Math.random() * 100) + 1); 
		int[] vetor = new int[n];
		
		try {
			System.out.println("Números no vetor: ");
			for (int i = 0; i < n; i++) {
				vetor[i] = (int) ((Math.random() * 100) + 1); 
				System.out.print(vetor[i] + " ");
				tabela.adiciona(vetor[i]);
			}
			
			tabela.listaParImpar();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
