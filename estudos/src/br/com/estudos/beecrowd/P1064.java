package br.com.estudos.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class P1064 {

	public void executa() {
		int positivo = 0;
		double media = 0;
		ArrayList<Double> numbers = new ArrayList<Double>();
		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			double aux = Double.parseDouble(leitor.next());
			numbers.add(aux);

			if (aux > 0) {
				positivo++;
				media += numbers.get(i);
			}
		}
		System.out.println(positivo + " valores positivos");
		System.out.printf("%.1f",media / positivo);
	}

}
