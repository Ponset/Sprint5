public class Sprint5_3 {
    public static void main(String[] args) {
        procesoMejora(38, 8, 30);
    }

    public static void procesoMejora(int temp, int edad, int peso) {
        int dosisParacetamol = 0;
        if (temp <= 37) {
            System.out.println("El niño esta bien.");
        } else if (temp > 37 && temp < 39) {
            System.out.println("Es recomendable darle un baño para bajar la temperatura.");
        } else if (temp >= 40) {
            System.out.println("Debe llevar al niño al hospital.");
        } else {
            if (edad < 3) {
                System.out.println("Debes consultar al médico.");
            } else if (edad > 3 && edad < 12) {
                dosisParacetamol = 15 * peso;
                System.out.println("Debe tomar " + dosisParacetamol + " mg.");
            } else if (edad >= 12) {
                dosisParacetamol = 500;
                System.out.println("El niño debe tomar " + dosisParacetamol + " mg.");
                System.out.println("Debe tomar Paracetamol cada 8h.");
            }
        }
    }
}
