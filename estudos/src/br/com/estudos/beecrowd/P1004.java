package br.com.estudos.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1004 {

	public void executa() throws NumberFormatException, IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		int A, B, X;

		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());

		X = A * B;

		System.out.printf("PROD = %d\n", X);
	}

}
