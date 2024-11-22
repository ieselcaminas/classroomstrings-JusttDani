package main;

public class Longitud {
    public static void main(String[] args) {
        String texto = "Esto es un texto de ejemplo";
        System.out.println(longitud(texto,2));

    }

    public static int longitud(String texto, int longitud) {
        String[] textopartido = texto.split(" ");
        int contador = 0;
        for (int i = 0; i < textopartido.length; i++) {
            if (textopartido[i].length() == longitud) {
                contador ++;
            }

        }
        return contador;
    }
}
