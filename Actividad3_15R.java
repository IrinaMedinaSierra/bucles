import java.util.Scanner;

public class Actividad3_15R {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica cuantos números de  ✈  tendra el triángulo");
        int n=sn.nextInt();
        //bucles dependientes
        int contador=0;
        for (int fila=1;fila<=n;fila++){ //filas
            for (int col=fila;col<=n;col++){
                System.out.print("✈ ");
                contador++;
            }
            System.out.println(" ");
        }
        System.out.println("Se han mostrado " + contador + " ✈ ");
    }
}
