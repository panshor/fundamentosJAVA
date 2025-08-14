
package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
                    Scanner leer = new Scanner(System.in);
            System.out.print("Digite el radio del círculo: ");
            int r = leer.nextInt();
             
             double area = 3.1416*(r*r);
                     System.out.println("El resultado es: "+area);

    }
    
}
