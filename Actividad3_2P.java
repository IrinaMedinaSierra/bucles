import java.util.Scanner;

public class Actividad3_2P {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica cuántas veces quieres te salude ->");
        int veces=sn.nextInt();
        for (int i=1;i<=veces;i++){
            System.out.println("Eco...Hola");
        }
    }
}
