package pa.uip.programación;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int año;
        System.out.print("Introduce año: ");
        año = Integer.parseInt(sc.readLine());
        if(esBisiesto(año))  //llamada al método
            System.out.println("Bisiesto");
        else
            System.out.println("No es bisiesto");
    }
    /**
     * método que calcula si un año es o no bisiesto
     */
    public static boolean esBisiesto(int a){
        if(a%4==0 && a%100!=0 || a%400==0)
            return true;
        else
            return false;
    }
}