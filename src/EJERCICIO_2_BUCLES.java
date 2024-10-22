import java.util.Scanner;

public class EJERCICIO_2_BUCLES {
    static int tarifaPorHora = 15;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de empleados contratados");
        int cantidadEmpleados = sc.nextInt();
        int[] horastrabajadas = new int[cantidadEmpleados];
        int[] salarioSemanal = new int[cantidadEmpleados];
        System.out.println(horastrabajadas.length);
        for (int i = 0; i < horastrabajadas.length ; i++) {
            System.out.println("Cuantas horas trabajo hoy el empleado " + (i+1) + "?");
            horastrabajadas[i] = sc.nextInt();
            horastrabajadas[i] *= 5;
            salarioSemanal[i] = horastrabajadas[i] * tarifaPorHora;
        }

        for (int i = 0; i < horastrabajadas.length; i++) {
            System.out.println("El empleado " + (i+1) + " tiene un salario de $" + salarioSemanal[i]+" por semana");
        }

        sc.close();


    }
}
