import java.util.Scanner;
public class EJERCICIO_4_BUCLES {
    static String[] diasSemana = {"lunes","Martes","miercoles","jueves","Viernes","sabado","domingo"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = 0;
        int cantidadVentas;
        int ventasTotal = 0;
        while(dias < 7){
            System.out.println("Introduce la cantidad de ventas del dia " + diasSemana[dias]);
            cantidadVentas = sc.nextInt();
            ventasTotal += cantidadVentas;
            dias++;
        }
        System.out.println("El total de ventas de la semana es de "+ ventasTotal+" ventas en total");

    }
}
