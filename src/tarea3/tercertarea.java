package tarea3;

import java.util.Scanner;

public class tercertarea {

    public void impre(){
        Scanner sc = new Scanner(System.in);
        int num[]; //Declarar la variable arreglo
        int n; //Variable de cuantos vamos a ingresa
        System.out.print("Cuantos Numeros Deseas Insertar: ");
        n = sc.nextInt();
        num = new int[n]; //El numero de arreglos
        //Ciclo para Insertar cantidades a n Numeros
        for (int i = 0; i < n; i++) {
            System.out.print("Inserta el valor del Numero[" + i + "] : ");
            num[i] = sc.nextInt();
        }
        
        //Arreglo para Acomodar Numeros()
        int aux=0;
        
        for(int j=0; j<n; j++){
                        //j=0;
                        //Ordenamos los numeros 0=5, 1=6, 2=3, 3=4;
            for(int i=0; i<n-1; i++){//i=0;
                //aux = 0;
               
                if(num[i] > num[i+1]){ //(Numero[]= > Numero[]=)
                    aux = num[i]; // aux = Numero[]=;
                    num[i] = num[i+1]; //Numero[]= = Numero[];
                    num[i+1] = aux; // Numero[]=aux;
                    
                }
            }
        }
        
        //Arreglo Para Imprimir()
        for (int i=0; i<n; i++){
            System.out.print("Pocision["+ (i)+ "]" + "--");
           System.out.println(num[i]);
        }
    }
}
