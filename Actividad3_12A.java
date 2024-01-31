import java.util.Scanner;

/*
*Modifica la Actividad de aplicación 3.11 para que el usuario pueda introducir un número en binario
* y el programa muestre su conversión a decima
*
* */
public class Actividad3_12A {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Indica el numero binario para convertirlo en decimal ->");
        int binario= sn.nextInt();
        int decimal=0;
        int base=1;
        while (binario!=0){
            int unidadBinaria=binario%2;
            binario/=10;
            decimal+=base*unidadBinaria;
            base*=2;
        }
        System.out.println("El numero binario en decimal es -> " + decimal);
    }
}
