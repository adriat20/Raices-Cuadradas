package pue.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Raices r;
        int intentos = 0;

        do {
            System.out.println("Introduce un valor para a");
            float a = teclado.nextFloat();
            System.out.println("Introduce un valor para b");
            float b = teclado.nextFloat();
            System.out.println("Introduce un valor para c");
            float c = teclado.nextFloat();
            r = new Raices(a, b, c);
            intentos++;
        } while (r.obtenerRaices() == null && intentos < 3);

        Soluciones soluciones = r.obtenerRaices();
        if (soluciones != null) {
            System.out.println("Los resultados de la raiz son " + soluciones.x1() + " y " + soluciones.x2());
        } else {
            throw new IllegalArgumentException("La raíz no tiene solución real");
        }
    }
}