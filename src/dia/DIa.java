
package dia;

import java.util.Scanner;


public class DIa {

    public static int a, m, d, e, f, c, b;  //Las variables que usaremos en el programa
   //public static enum Dia {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;


    public static void main(String[] args) {
     

        
        Scanner ac = new Scanner(System.in);
   
        
        do{
        
        
        System.out.println("dame el año: "); //Con esto pedimos el año
        a=ac.nextInt();
    }while(a<0||a>10000);
    
    do{
        System.out.println("dame el mes: "); //Con esto pedimos el mes
        m=ac.nextInt();
    }while(m<1||m>12);
        
    do{    
        System.out.println("dame el dia: "); //Con esto pedimos el dia
        d=ac.nextInt();
    }while(d<1||d>31);
        
        if(m>2){  //si se cumple esta condicion hace las operaciones siguientes
            m=m-2;
            c=a/100;
            e=a%100;
            
            b=(((13*m)-1)/5)+(e/4)+(c/4);
           
           f=(b+e+d-(2*c));
            f=f%7;        
            
        }
        else{        //si no se cumple la primera condicion entra este conjunto de operaciones
            m=m+10;
            a=a-1;
            c=a/100;
            e=a%100;
            b=(((13*m)-1)/5)+(e/4)+(c/4);
            
            f=(b+e+d-(2*c));
            f=f%7;
        }
        
    System.out.println("0 = Domingo"); //con esto sabemos a que dia se refiere cada numero 
    System.out.println("1 = Lunes");
    System.out.println("2 = Martes");
    System.out.println("3 = Miercoles");
    System.out.println("4 = Jueves");
    System.out.println("5 = Viernes");
    System.out.println("6 = Sabado");
    
        //f--;
       switch(f){
           case 1:
               System.out.println("Lunes");
               break;
           case 2:
               System.out.println("martes");
               break;
           case 3:
               System.out.println("miercoles");
               break;
           case 4: 
               System.out.println("jueves");
               break;
           case 5:
               System.out.println("viernes");
               break;
           case 6:
               System.out.println("sabado");
               break;
           default:
               System.out.println("domingo");
               break;
       }
       
        //System.out.println("El dia anterior es: " + f); //Imprime el dia anterior al solicitado
        
        //f++;
        //System.out.println("El dia es: " + f); //Imprime el dia solicitado
        //f++;
        //System.out.println("El dia siguiente es: " + f); //Imprime el dia despues del solicitado
        
    }
    
}
