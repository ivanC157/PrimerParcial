
package caracol;

import java.util.Scanner;


public class Caracol {

    public static int P, R, S, aux;
    public static int contador=0;
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        do{
        System.out.println("Dame la profundida: ");
        P=ac.nextInt();
        }while(P<1||P>1000000);
        
        do{
        System.out.println("Dame la subida: ");
        S=ac.nextInt();
        }while(S<1||S>1000000);
        do{
        System.out.println("Dame la caida: " );
        R=ac.nextInt();
        }while(R>S); 
        
        do{
          
            
            S=S-R;
            S=S+S;
            contador++;
            
        }while(S<=P);
        
        System.out.println("Tardo "+ contador + " dias en subir");
        
        
        
        
        
    }
    
}
