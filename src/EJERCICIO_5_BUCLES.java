import java.util.Scanner;
import java.math.*;

public class EJERCICIO_5_BUCLES {
    static int tarifaHora = 15;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de empleados");
        int numeroEmpleados = sc.nextInt();
        int [] horasEmpleados = new int[numeroEmpleados];
        int [] salarioEmpleados = new int[numeroEmpleados];
        do {
            if(numeroEmpleados == 0){
                break;
            }
            System.out.println("Ingrese las horas que trabaja diariamente");
            horasEmpleados[numeroEmpleados - (numeroEmpleados-1)]= sc.nextInt();
            horasEmpleados[numeroEmpleados - (numeroEmpleados-1)] *= 6;

            if (horasEmpleados[numeroEmpleados - (numeroEmpleados-1)] > 40 ) {
                salarioEmpleados[numeroEmpleados - (numeroEmpleados-1)] = (((horasEmpleados[numeroEmpleados - (numeroEmpleados-1)] - (horasEmpleados[numeroEmpleados - (numeroEmpleados-1)]-40))*tarifaHora) + ((horasEmpleados[numeroEmpleados - (numeroEmpleados-1)]-40)* (tarifaHora * 2)) );
                System.out.println("El Empleado trabajo "+ (horasEmpleados[numeroEmpleados - (numeroEmpleados-1)] - 40)+" horas extras, por lo tanto su sueldo esta semana sera de "+ salarioEmpleados[numeroEmpleados - (numeroEmpleados-1)] );
            }else {
                salarioEmpleados[numeroEmpleados - (numeroEmpleados-1)] = horasEmpleados[numeroEmpleados - (numeroEmpleados-1)] * tarifaHora;
                System.out.println("El sueldo semanal del empleado es de "+ salarioEmpleados[numeroEmpleados - (numeroEmpleados-1)]);
            }
            numeroEmpleados --;
        }while(numeroEmpleados > 0);

    }
}
