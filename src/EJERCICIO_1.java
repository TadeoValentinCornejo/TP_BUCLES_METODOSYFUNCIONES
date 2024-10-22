import java.util.Scanner;

public class EJERCICIO_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] actividades = {"estudiar","hacer ejercicios","leer","tiempo libre"};
        int [] horas = new int [actividades.length];
        System.out.println(horas.length);

        for (int i = 0; i < actividades.length; i++) {
            System.out.println("Ingresa la cantidad de horas que le dedicas a "+ actividades[i]+" al dia:");
            horas[i] = sc.nextInt();
        }

        int tiempoTotal = 0;
        for (int i = 0; i < horas.length; i++) {
            tiempoTotal += horas[i];
        }

        System.out.println("El tiempo total dedicado a todas las actividades diarias es: "+ tiempoTotal);
        sc.close();
    }
}
