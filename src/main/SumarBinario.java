package main;

public class SumarBinario {
    public static void main(String[] args) {
        String cadena1 = "1011";
        String cadena2 = "1001";
        System.out.println(sumarBinario(cadena1, cadena2));
    }
    public static String sumarBinario(String cadena1, String cadena2) {
        String res = "";
        int a;
        int b;
        int acarreo = 0;
        for (int i = cadena1.length()-1; i >= 0; i--) {
            a = Integer.parseInt("" + cadena1.charAt(i));
            b = Integer.parseInt("" + cadena2.charAt(i));
            int suma = a + acarreo + b;
            res = ((suma % 2 == 0) ? "0" : "1") + res;
            acarreo = (suma > 1) ? 1 : 0;


        }
        if (acarreo == 1) {
            res = "1"+ res;
        }
        return res;
    }
}
