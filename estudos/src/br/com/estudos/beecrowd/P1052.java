package br.com.estudos.beecrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1052 {

	public void executa() {
		Scanner sc = new Scanner(System.in);
		int mes = sc.nextInt();

		Mes e = Mes.valueOf(mes);
		System.out.println(e.name());
	}

	public enum Mes {
		January(1), February(2), March(3), April(4), May(5), June(6), July(7), August(8), September(9), October(10),
		November(11), December(12);

		private int value;
		private static Map map = new HashMap<>();

		private Mes(int value) {
			this.value = value;
		}

		static {
			for (Mes mes : Mes.values()) {
				map.put(mes.value, mes);
			}
		}

		public static Mes valueOf(int mes) {
			return (Mes) map.get(mes);
		}

		public int getValue() {
			return value;
		}

	}

}
