package br.com.estudos.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1005 {

	public void executa() throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		double A, B, Media;

		A = Double.parseDouble(in.readLine());
		B = Double.parseDouble(in.readLine());
		Media = ((A * 3.5) + (B * 7.5)) / 11;
		System.out.printf("MEDIA = %.5f%n", (Media));

	}
}
