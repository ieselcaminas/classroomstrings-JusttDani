package main;

public class Longitud3 {
    public static void main(String[] args) {
        String texto = "Esto es un texto de ejemplo";
        if(longitud(texto, 6)){
            System.out.println("Hay alguna palabra larga");
        }else{
            System.out.println("Todas las cadenas son cortas");
        }
    }

    public static boolean longitud(String texto, int longitud) {
        String[] textopartido = texto.split(" ");
        for (int i = 0; i < textopartido.length; i++) {
            if (textopartido[i].length() >= longitud) {
                return true;
            }

        }
        return false ;
    }
}
