
package pue.java;

public class Raices {
    private float a;
    private float b;
    private float c;
    private float raiz1;
    private float raiz2;

    public Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean obtenerRaices() {
        float discriminante = (float) (Math.pow(b,2)) - 4 * a * c;
        if (discriminante < 0) {
            System.out.println("No hay raíces. Introduce otros valores\n");
            return false;
        } else if (discriminante == 0) {
            raiz1 = raiz2 = -b / (2 * a);
        } else {
            raiz1 = (-b + (float)Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b - (float)Math.sqrt(discriminante)) / (2 * a);
        }
        return true;
    }


    public float getRaiz1() {
        return raiz1;
    }

    public float getRaiz2() {
        return raiz2;
    }
}