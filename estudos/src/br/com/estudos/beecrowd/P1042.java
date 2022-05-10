package br.com.estudos.beecrowd;

import java.util.Scanner;

public class P1042 {
	public void executa() {
		int[] vet = new int[3];
		int[] vet2 = new int[3];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(sc.next());

		}

		vet2 = vet.clone();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (vet[j] > vet[j + 1]) {
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d\n", vet[i]);
		}
		System.out.printf("\n");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d\n", vet2[i]);
		}
	}
}
