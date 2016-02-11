
package collatz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Collatz {

    public static int n,c=0, aux=0;//creo mis vareables
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
      do{
        System.out.println("Dame el numero... "); //pido el numero al usuario, este esta condicionado por un do while
        
        n=Integer.parseInt(bf.readLine());
      }while(n<1||n>1000000);
        
     
      while(n!=1){         //iniciamos con un ciclo while para comparar "n"
        if(n%2==0){        //usamos un if para ver si es par
            n=n/2;
       
            if(n>=aux){    //usamos este if para poder saber cual es el numero mayor
                aux=n;
                
            }
            
        }else{           //este else entra si el numero no es par
            n=(3*n)+1;
        if(n>=aux){
                aux=n;
                
            }
        }
        
       
        
        c++;            //usamos este c++ para saber el largo de la secuencia   
        System.out.print("  " + n);//imprime todos los numeros de la serie
        
        
        
        
    }
    System.out.println("");
      c++;//este c++ suma 1 para que cuente el largo desde el numero que introduce el usuario
      System.out.println("largo: " + c);
      System.out.println("Mayor: " + aux);
    
    
    }
}