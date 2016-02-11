
package sistemaingles;

import java.util.Scanner;


public class SistemaIngles {

    public static int millas, furlongs, yardas, pies, auxiliar, q;
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
   
        
    do{    
        
    System.out.println("Dame las pulgadas a convertir: ");
     q = ac.nextInt();
    }while(q<=0 || q>=2000000000);   
    
    millas= q/63360;
    auxiliar= q%63360;
    
    furlongs = auxiliar/7920;
    auxiliar=auxiliar%7920;
    
    yardas=auxiliar/36;
    auxiliar=auxiliar%36;
    
    pies = auxiliar/12;
    auxiliar= auxiliar%12;
    
    
    
    
    
    
    System.out.println("millas: " + millas);
    System.out.println("furlongs: " + furlongs);
    System.out.println("yardas: " + yardas);
    System.out.println("pies: " + pies);
    System.out.println("pulgadas: " + auxiliar);
    
    
    }
    
}
