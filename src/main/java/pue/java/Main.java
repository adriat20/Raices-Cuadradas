package pue.java;

import java.util.*;

public class Main {
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args) {
        Raices r;
        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce un valor para a");
            float a = teclado.nextFloat();
            System.out.println("Introduce un valor para b");
            float b = teclado.nextFloat();
            System.out.println("Introduce un valor para c");
            float c = teclado.nextFloat();
            r = new Raices(a, b, c);


        } while (!r.obtenerRaices());


        System.out.println("Los resultados de la raiz son " + r.getRaiz1() + " y " + r.getRaiz2());
    }
}

