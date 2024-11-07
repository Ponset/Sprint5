public class Sprint5_2 {
    public static void main(String[] args) {
        notaEvaluacion(7, 7, 7);
    }

    public static void notaEvaluacion(int notaPrueba, int numEntregas, int notaPracticas) {
        int totalEntregas = 10;
        boolean noSeguidaAC = false;
        double notaEntregas = 0;
        double notaEva = 0;

        if (notaPrueba < 7) {
            System.out.println("Has suspendido la prueba final.");
        } else if (numEntregas < 70 * (totalEntregas / 100)) {
            System.out.println("Has suspendido, no has seguido la evaluación.");
            noSeguidaAC = true;
        } else if (numEntregas == totalEntregas) {
            notaEntregas = 10;
        } else if (numEntregas >= 90 * (totalEntregas / 100)) {
            notaEntregas = 8;
        } else if (numEntregas >= 80 * (totalEntregas / 100)) {
            notaEntregas = 6;
        } else if (numEntregas >= 70 * (totalEntregas / 100)) {
            notaEntregas = 4;
        }

        notaEva = notaPrueba * 0.2 + notaEntregas * 0.1 + notaPracticas * 0.7;

        if (notaEva < 5) {
            if (noSeguidaAC) {
                System.out.println("Sigue la evaluacción.");
            } else {
                System.out.println("Haz los ejercicios preparatorios para la PAF2.");
            }
        } else {
            System.out.println("Nota final: " + notaEva);
        }
    }
}
