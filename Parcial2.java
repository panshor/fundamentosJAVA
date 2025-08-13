
package parcial2;

import java.util.Scanner;
public class Parcial2 {


    public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);
            System.out.print("Digite un número: ");
            int n = leer.nextInt();
            
            if(n>0){
            if(n%1==0 && n%n==0 && n%4==0){
                System.out.println("El número NO es primo");
                
            }else{
                System.out.println("El número que digitó es primo");
                
            }
            }else{
                System.out.println("El número que digitó es incorrecto");
            }
            
        

    }
    
}
