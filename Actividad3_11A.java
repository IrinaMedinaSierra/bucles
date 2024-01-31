import java.util.Scanner;

/*
* Realiza un programa que convierta un número decimal en su representación binaria. Hay que tener en cuenta
*  que desconocemos cuántas cifras tiene el número que introduce el usuario.Por simplicidad, iremos mostrando
*  el número binario con un dígito por línea
* */
public class Actividad3_11A {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Indica el numero decimal -> ");
        int numero=sn.nextInt();

        while (numero!=0){
            int unidadBinaria=numero%2;
            numero/=2;
            System.out.println(unidadBinaria);
        }
    }

}
