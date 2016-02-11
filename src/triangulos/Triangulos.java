
package triangulos;

import java.util.Scanner;


public class Triangulos {

   public static int a, b, c, d=0;
    public static void main(String[] args) {
       
        Scanner ac = new Scanner(System.in);
       
        
     do{   
        System.out.println("Dame el valor de a... ");
        a=ac.nextInt();
     }while(a<-1000000000 || a>1000000000);
     
     do{
        System.out.println("Dame el valor de b... ");
        b=ac.nextInt();
     }while(b<-1000000000 || b>1000000000);
        
     do{
        System.out.println("Dame el valor de c... ");
        c=ac.nextInt();
     }while(c<-1000000000 || c>1000000000);
        
     if(a + b > c && b + c > a && c + a > b){
         if((a==b) && (b==c)){
             
         System.out.print("1");
         
         }else{
             if((a == b && b!=c) || (b==c && b!=a) || (a == c && c !=b)){
                 System.out.print("2");
                 
             }else{
                 
                 System.out.print("3");
                 
             }
         }
         
         System.out.println("0");
         
     }else{
         System.out.print("0");
         
        do{
            
            a++;
            b++;
            c++;
            d++;
            
            
        }while((a + b > c) && (b + c >a) && (c + a > b)); 
         
         System.out.println(" " + d);
         
     }   
        
        
    
    }
    

}
