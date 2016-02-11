
package divisores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Divisores {

  public static int a, b=0, c;  
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        do{
            System.out.println("Dame el numero... " );
            a=Integer.parseInt(bf.readLine());
        }while(a<1 || a>100000);
        
        
       
           for (int i = 1 ; i <= a ; i++){
            if (a % i == 0){
                b++;
                
            }
            } 
            
            
     
        
        
        System.out.println("el numero a dividir es: " + a);
        
        System.out.println("y es divisible: "+ b);
        
        
        
        
    }
    
}
