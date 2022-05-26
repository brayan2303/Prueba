package pruebatecnica;

import java.util.Scanner;

/**
 * @author Brayan Algecira
 */
public class PruebaTres {

    public static void main(String[] args) {
        try {
            System.out.println("Ingrese datos seguidos de un espacio:");
            Scanner entry = new Scanner(System.in); //Entrada
            int cantCount = entry.nextInt(); //Cantidad de velas a ingresar
            int[] candlesHappy = new int[cantCount]; // objeto
            int maxCandles = -1; // validacion para conteo
            int countCandles = 0;//cantidad a retornar
            for (int cant = 0; cant < cantCount; cant++) { //recorrido de velas
                candlesHappy[cant] = entry.nextInt(); // cantidad separada por espacio
                if (candlesHappy[cant] > maxCandles) { // valiadacin de la cantidad que sea mayor a maxCandles  coloque 1 
                    maxCandles = candlesHappy[cant];
                    countCandles = 1; // 
                } else if (candlesHappy[cant] == maxCandles) { // si son iguales sume 1
                    countCandles++;
                }
            }
            System.out.println(countCandles);
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
