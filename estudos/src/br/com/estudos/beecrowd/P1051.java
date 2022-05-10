package br.com.estudos.beecrowd;

import java.util.Scanner;

public class P1051 {
	public void executa() {
		Scanner leitor = new Scanner(System.in);
		double salario = Double.parseDouble(leitor.next());
		
		if (salario >= 0 && salario <= 2000) {
			System.out.println("Isento");
		} else if (salario > 2000 && salario <= 3000) {//8%
			System.out.println(String.format("R$ %.2f", (salario - 2000) * 0.08));
		} else if (salario > 3000 && salario <= 4500) {//18%
			System.out.println(String.format("R$ %.2f", ((salario - 3000) * 0.18) + 80));
		} else {//28%
			System.out.println(String.format("R$ %.2f", ((salario - 4500) * 0.28) + 350));
		}
	}
}
