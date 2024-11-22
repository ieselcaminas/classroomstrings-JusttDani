package main;

public class Alfabbetica {
    public static void main(String[] args) {
        String texto = "himnos";
        if(alfabeta(texto)) {
            System.out.println("Es alfabetica");
        }else{
            System.out.println("No es alfabetica");
        }
    }
    public static boolean alfabeta(String texto) {
        String[] texto2 = texto.split("");
        for (int i = 0; i < texto2.length - 1; i++) {
            if (texto2[i].compareTo(texto2[i+1]) >= 0) {
                return false;
            }
        }
        return true;
    }
}
