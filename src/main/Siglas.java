package main;

public class Siglas {
    public static void main(String[] args) {
        String texto = "Mi Casa Esta Chula";
        System.out.println(siglas(texto));
    }
    public static String siglas(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                resultado = resultado + texto.charAt(i);
            }
        }
        return resultado;
    }
}
