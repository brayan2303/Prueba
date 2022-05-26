package pruebatecnica;

import java.util.Scanner;

/**
 * @author Brayan Algecira
 */
public class ProblemaDos {

    public static void main(String[] args) {
        try {
            System.out.println("Ingrese datos seguidos de un espacio:");
            Scanner entry = new Scanner(System.in); //Entrada    
            long Datasum = 0; // Variable de contido de suma Long variable de entero
            long DataMax = Long.MIN_VALUE; // Variable maxima
            long DataMin = Long.MAX_VALUE; // Variable minima
            for (int i = 0; i < 5; i++) { // recorrido hasta 5
                long whole = entry.nextLong();
                Datasum += whole; // continuidad 
                DataMax = Math.max(DataMax, whole); // resultado maximo
                DataMin = Math.min(DataMin, whole); // resultado minimo
            }
            System.out.println((Datasum - DataMax) + " " + (Datasum - DataMin)); //resultado minimo y maximo
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
