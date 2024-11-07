public class Sprint5_1 {
  public static void main(String[] args) {
    int edad = 6;
    evaluarCiclo(edad);

  }

  public static void evaluarCiclo(int edad) {
    int ciclo = -1;
    int curso = -1;

    if (edad < 3) {
      System.err.println("Es demasiado pequeño.");
    } else if (edad < 6) {
      ciclo = 0;
    } else if (edad < 7) {
      ciclo = 1;
      curso = 1;
    } else if (edad < 8) {
      ciclo = 1;
      curso = 2;
    } else if (edad < 9) {
      ciclo = 2;
      curso = 3;
    } else if (edad < 10) {
      ciclo = 2;
      curso = 4;
    } else if (edad < 11) {
      ciclo = 3;
      curso = 5;
    } else if (edad < 12) {
      ciclo = 3;
      curso = 6;
    } else {
      System.err.println("Es demasiado grande.");
    }

    switch (ciclo) {
      case 0:
        System.out.println("Es de educación infantil.");
        break;
      case 1:
        System.out.println("Es de educación primaria. Ciclo inicial.");
        break;
      case 2:
        System.out.println("Es de educación primaria. Ciclo medio.");
        break;
      case 3:
        System.out.println("Es de educación primaria. Ciclo superior.");
        break;
    }

    if (curso != -1) {
      System.out.println("Curso: " + curso);
    }
  }
}