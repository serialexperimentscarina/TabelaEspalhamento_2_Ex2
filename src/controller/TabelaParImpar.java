package controller;

import br.com.serialexperimentscarina.listaint.ListaInt;

public class TabelaParImpar implements ITabelaParImpar{

	ListaInt[] tabelaDeEspalhamento;
	
	public TabelaParImpar() {
		tabelaDeEspalhamento = new ListaInt[2];
		
		for (int i = 0; i < 2; i++) {
			tabelaDeEspalhamento[i] = new ListaInt();
		}
	}

	@Override
	public void adiciona(int num) throws Exception {
		int hash = hashCode(num);
		ListaInt l = tabelaDeEspalhamento[hash];
		
		l.addFirst(num);
	}

	@Override
	public void listaParImpar() throws Exception {
		ListaInt par = tabelaDeEspalhamento[0];
		ListaInt impar = tabelaDeEspalhamento[1];
		int tamanhoP = par.size();
		int tamanhoI = impar.size();
		
		if (tamanhoP >= 1) {
			System.out.println("\nNúmeros pares: ");
			for (int i = 0; i < tamanhoP; i++) {
				System.out.print(par.get(i) + " ");
			}
		} else {
			System.out.println("\nNão há números pares na tabela de espalhamento.");
		}

		if (tamanhoI >= 1) {
			System.out.println("\nNúmeros ímpares: ");
			for (int i = 0; i < tamanhoI; i++) {
				System.out.print(impar.get(i) + " ");
			}
		} else {
			System.out.println("\nNão há números ímpares na tabela de espalhamento.");
		}
	}
	
	// Função Hash
	private int hashCode(int num) {
		return (num % 2);
	}

}
