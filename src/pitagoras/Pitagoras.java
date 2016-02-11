
package pitagoras;

import java.util.Scanner;


public class Pitagoras {
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
                 
              if(((a*a)+(b*b))==(c*c)){ //con esto comparamos si la suma de b y a es igual a c
                  p++; //el contador que nos dice cuantas ternas pitagoricas tenemos 
              }   
                 
             }
         }
     }
              System.out.println("Ternas pitagoricas: " + p);
          }
           
           
       }
       
       
       
    
    

