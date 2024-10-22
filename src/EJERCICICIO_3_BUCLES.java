import java.util.Scanner;

public class EJERCICICIO_3_BUCLES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de productos que tienes en el inventario");
        int productos = sc.nextInt();
        int cantidadDeProductos = 0;

        while (productos > 0) {
            System.out.println("ingresa la cantidad disponible del producto");
            cantidadDeProductos = sc.nextInt();
            if (cantidadDeProductos < 5){
                System.out.println("Es necesario realizar un pedido");
            }
            productos--;
        }
        }
    }

