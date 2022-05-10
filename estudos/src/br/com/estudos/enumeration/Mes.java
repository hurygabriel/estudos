package br.com.estudos.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum Mes {
	JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10),
	NOVEMBER(11), DECEMBER(12);

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
    
    //PageType pageType = PageType.valueOf(2); // pageType = PageType.CODING
    
   // ProductType productType = ProductType.DATABASES;
   // int productTypeId = productType.getValue(); // productTypeId = 3
    
    
}
