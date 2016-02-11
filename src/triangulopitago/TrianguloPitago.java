
package triangulopitago;

import java.util.Scanner;


public class TrianguloPitago {
public static int m, n, a,b,c, p=0;
   
    public static void main(String[] args) {
           Scanner ac = new Scanner(System.in);
       do{
       System.out.println("Dame m: ");
       m=ac.nextInt();
       }while(m<1||m>1000000);
       
       do{
       System.out.println("Dame n: ");
       n=ac.nextInt();
       }while(n<1||n>1000000);
     
       for(a=m;a<=n;a++){ //este va aumentando a
         
         
         for(b=a;b<=n;b++){//este va aumentando b
             
             for(c=b;c<=n;c++){ //este aumenta c
                 
             
           if(a+b>c){ //la terna triangular dice que la suma de a+b debe ser mayor a c
                           //si esto no se cumple no es terna triangular 
               if(a+c>b){   //esta la funcion de los if
                   
                   if(b+c>a){
                       
                       p++; //este cuenta las ternas triangulares que tiene 
                   }
               }
               
           }
               
               
           }
              
              
             }
         }
    System.out.println("Ternas triangulares: " + p);
    }
               
    
    
    
    
    }
    

