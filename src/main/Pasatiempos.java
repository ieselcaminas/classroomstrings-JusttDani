package main;

public class Pasatiempos {
    public static void main(String[] args) {
        String texto = "Texto de ejemplo ";

        System.out.println(creapasatiempos(texto));

    }
    public static String creapasatiempos(String texto) {
        texto = texto.replaceAll("[eioua]", "*");
        return texto;
    }

}
