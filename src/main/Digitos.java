package main;

public class Digitos {
    public static void main(String[] args) {
    String texto =  "1 20 hola 234 45a";
    System.out.println(digitos(texto));
    }
    public static int digitos(String texto) {
        int resultado = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                resultado++;
            }
        }
        return resultado;
    }
}
