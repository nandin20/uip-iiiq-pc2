package Masco;

import java.util.Scanner;

import static java.lang.System.*;

public class menu {
    private int opcion;
    private Mascota mascota;
    private Scanner leer = new Scanner(System.in);

    public menu() {
        mascota = new Mascota("licho");
    }

    public void desplegar() {
        do {
            mascota.estado();
            out.println("1. - Alimentar");
            out.println("2. - Golpear");
            out.println("3. - Revivir");
            out.println("4. - salir");
            out.print("op: ");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    mascota.alimentar();
                    break;
                case 2:
                    mascota.golpear();
                    break;
                case 3:
                    mascota.revivir();
                    break;
                case 4:
                    out.println("Hasta Luego");
                    break;
            }
        }
        while (opcion != 4);
    }
}

