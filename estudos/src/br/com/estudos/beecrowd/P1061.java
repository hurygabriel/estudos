package br.com.estudos.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P1061 {

	public void executa() throws IOException, Exception {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		String diaInicio = in.readLine();
		String horaInicio = in.readLine();
		String diaFim = in.readLine();
		String horaFim = in.readLine();

		diaInicio = diaInicio.replaceAll("\\D+", "");
		diaFim = diaFim.replaceAll("\\D+", "");

		SimpleDateFormat formata = new SimpleDateFormat("dd MM yyyy HH : mm : ss");

		Date dataInicio = formata.parse(diaInicio + " 01 2000 " + horaInicio);
		Date dataFim = formata.parse(diaFim + " 01 2000 " + horaFim);

		long difference_In_Time = dataFim.getTime() - dataInicio.getTime();
		long difference_In_Seconds = (difference_In_Time / 1000) % 60;
		long difference_In_Minutes = (difference_In_Time / (1000 * 60)) % 60;
		long difference_In_Hours = (difference_In_Time / (1000 * 60 * 60)) % 24;
		long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
		// long difference_In_Years = (difference_In_Time / (1000l * 60 * 60 * 24 *
		// 365));

		System.out.println(difference_In_Days + " dia(s)");
		System.out.println(difference_In_Hours + " hora(s)");
		System.out.println(difference_In_Minutes + " minuto(s)");
		System.out.println(difference_In_Seconds + " segundo(s)");

	}
}

/*
Dia 5
08 : 12 : 23
Dia 6
09 : 11 : 24
 */
