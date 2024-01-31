import java.util.Scanner;

public class Actividad3_3P {
    public static void main(String[] args) {
        //Implementa un programa que pida al usuario un número positivo
        // y lo muestre guarismo a guarismo. Por ejemplo, para el número 123,
        // debe mostrar primero el 3, a continuación el 2 y por último el 1.

        Scanner sn=new Scanner(System.in);
        System.out.println("Indica el Número positivo y lo motrare guarismo");
        int numero=sn.nextInt(); // leemos el numero
        int numeroFor=numero; // aqui igualamos
        int unidad=0;
        // para mostrarlo voy a calcular el unidad %10 y luego lo divido /10 hasta que el numero sea 0
        System.out.println("**** Con bucle While ****");
        while (numero>0){
            unidad=numero%10;
            System.out.println(unidad);
            numero/=10;
        }

        System.out.println("*****Con bucle FOR *****");
        //  con bucle for
        for (int i=numeroFor;i>0;i/=10){ // lo mismo que while, pero en la instrucción for, inicializando i = numero leido y el incremento es la división/10
            System.out.println(i%10);
        }




    }
}
