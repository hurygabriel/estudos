package br.com.estudos.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class P1065 {

	public void executa() {

		ArrayList<Integer> vet = new ArrayList<Integer>();
		Scanner leitor = new Scanner(System.in);
		int pares = 0;

		for (int i = 0; i < 5; i++) {
			vet.add(leitor.nextInt());
		}

		for (int num : vet) {
			if (num % 2 == 0) {
				pares++;
			}
		}
		System.out.println(pares + " valores pares");
	}
}
