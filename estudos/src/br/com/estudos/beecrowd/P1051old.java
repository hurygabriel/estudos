package br.com.estudos.beecrowd;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1051old {

    public static NumberFormat seuFormato() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        symbols.setGroupingSeparator(',');
        return new DecimalFormat("#0.00", symbols);
    }
	
	public void executa() {
		double renda, imposto = 0, aux;
		Scanner sc = new Scanner(System.in);
		renda = Double.parseDouble(sc.next());
		
		NumberFormat formatter = seuFormato();

		if (renda >= 0.00 && renda <= 2000.00) { // isento
			System.out.print("Isento");
		} else if (renda >= 2000.01 & renda <= 3000) { // 8%
			aux = renda;

			aux -= 2000;
			imposto = aux * 0.08;
			System.out.print("R$ "+formatter.format(imposto));
		} else if (renda >= 3000.01 && renda <= 4500) {// 18%
			aux = renda;

			aux -= 3000;
			imposto = aux * 0.18;

			aux = renda - 2000 - aux;
			imposto += aux * 0.08;
			System.out.print("R$ "+formatter.format(imposto));
		} else { // 28%
			aux = renda;

			aux -= 4500;
			imposto = aux * 0.28;

			aux = renda - 3000 - aux;
			imposto += aux * 0.18;

			aux = renda - 2000 - aux - (renda - 4500);
			imposto += aux * 0.08;
			
			System.out.print("R$ "+formatter.format(imposto));
		}

	}
}
