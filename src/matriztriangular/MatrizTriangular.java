
package matriztriangular;


import java.io.IOException;
import java.util.Scanner;



public class MatrizTriangular {

 
    public static void main(String[] args) throws IOException {
        Scanner dato = new Scanner(System.in);
        int n;
        
        
        System.out.println("Dame el tamaño de la matriz: ");
        n=dato.nextInt();
       
        int [][] matriz = new int[n][n];
        
        for(int i = 0; i<n;i++){
         
       
          
         for(int j =0; j<n; j++){
         
               System.out.println("Dame la posicion-->" + (i+1) + ", " + (j+1));
             matriz[i][j] = dato.nextInt();
   }
   
        
        
      
            
        }
   
     for(int i=0;i<n;i++){
             
      for(int j = i+1; j<n; j++){
          
          System.out.print( matriz[i][j]+ "  ");
          
         
      }  
    } 
     System.out.println();
     for(int i=0;i<n;i++){
             
      for(int j = i+1; j<n; j++){
          
          System.out.print( matriz[j][i]+ "  ");
          
         
      }  
    } 
 
    
    
    }
}
    
    

