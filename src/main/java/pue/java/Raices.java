
package pue.java;

class Raices {
    private float a, b, c;

    Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Soluciones obtenerRaices() {
        float discriminante = (float) (Math.pow(b, 2)) - 4 * a * c;
        if (discriminante < 0) {
            return null;
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            return new Soluciones(raiz, null);
        } else {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return new Soluciones(raiz1, raiz2);
        }
    }
}