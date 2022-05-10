package br.com.estudos.beecrowd;

import java.util.Scanner;

/*
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X.
 *  Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e 
 *  não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error". 
 */
public class P1001 {

	void executa() {
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();
		System.out.println("X = " + (a + b));
	}
}
