package main;

public class Longitud2 {
    public static void main(String[] args) {
        String texto = "Esto es un texto de ejemplo";
        if(longitud(texto, 5)){
            System.out.println("Hay almenos una palabra");
        }else{
            System.out.println("No hay ni una palabra");
        }
    }

    public static boolean longitud(String texto, int longitud) {
        String[] textopartido = texto.split(" ");
        for (int i = 0; i < textopartido.length; i++) {
            if (textopartido[i].length() == longitud) {
                return true;
            }

        }
        return false ;
    }
}