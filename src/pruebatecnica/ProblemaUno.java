package pruebatecnica;

import java.util.Scanner;

/**
 * @author Brayan Algecira
 */
public class ProblemaUno {

    public static void main(String[] args) {
        try {
            System.out.println("Ingrese datos seguidos de un espacio:");
            Scanner entry = new Scanner(System.in); //Entrada      
            int[] sock = new int[101]; //color de medias
            int result = 0; // variable de retorno de cantidad
            int cant = entry.nextInt(); //cantidad de medias
            for (int i = 0; i < cant; i++) {  // recorrido de cantidad de medias
                int sockColor = entry.nextInt();
                sock[sockColor]++;  // contenedor medias separados por espacio
                if (sock[sockColor] % 2 == 0) {
                    result++;
                    sock[sockColor] = 0;
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
