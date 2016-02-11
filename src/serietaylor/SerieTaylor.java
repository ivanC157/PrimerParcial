
package serietaylor;

import java.util.Scanner;


public class SerieTaylor {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double n, num1, aux, num2, sum;
        System.out.println("Dame el final de la serie: ");
        n=teclado.nextDouble();
        
        
        for(double i= 1;i<=n;i++){ //Este da el denominador 
            
          
          for(double x=2;x<=n;x++){ //Este da el numerador
              
              for(double p = 1;p<=n;p++){ //Este da la potencia
                  
                 num2= Math.pow(i, p)/x;   //operacion principal
              
                 
                 sum=num2;
                 
                 num1= sum+num2;
                 aux= num1;
                 
                
                
                  
                      
            System.out.println(("La serie es: ")+aux);  
              
                  
                  
              }
              
              
              
               
          } 
         


            
           
           
        }
        
        
        
        
        
    }
    
}
