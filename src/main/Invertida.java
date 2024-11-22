package main;

public class Invertida {
    public static void main(String[] args) {
        String texto = "Esto es una frase";
        System.out.println(texto);
        System.out.println(invertida(texto));
    }
    public static String invertida(String texto) {
        String[] texto2 = texto.split(" ");
        String resultado = "";
        for (int i = texto2.length - 1; i > -1; i--) {
             resultado += texto2[i] + " ";
        }
        return resultado;
    }
}
