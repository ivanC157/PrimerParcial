
package pascua;

import java.util.Scanner;


public class Pascua {

   public static int A, B ,C, E, F, G, H, I, J, Aux, Aux1;
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        //do{
        System.out.println("Dame el año: ");
        A= ca.nextInt();
        //}while(A>1583&&A<9999);
        
        B= (A/100)+1;
        C= ((3*B)/4)-12;
        E= (A%19)+1;
        F= (((8*B)+5)/25)-(5+C);
        G= ((5*A)/4)-(C+10);
        H= (((11*E)+20)+F)%30;
        
        if(H!=25){
        
                H+=1;
            }
        else{
            if(E>11){
                H+=1;
            }
        }
        I=44-H;
        
        if(I<21){
            I=I+30;
        }
        
       J=((I+7)-((G+I))%7);
        
        System.out.println("el dia de pascua es: " + J);
    }
    
}
