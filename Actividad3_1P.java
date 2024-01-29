import java.util.Scanner;

public class Actividad3_1P {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        byte edad,edadMinima,edadMaxima;
        System.out.println("Indica la edad->"); //Esta linea se tiene que repetir
        edad= sn.nextByte();
        edadMaxima=edad;
        edadMinima=edad;
        /*****/
        while (edad!=-1){ //se repetira mientras el usuario no escriba -1
            //condicionales if
            if (edadMinima>edad){
                edadMinima=edad;
            }
            if (edadMaxima<edad){
                edadMaxima=edad;
            }
            System.out.println("Indica la edad->");
            edad= sn.nextByte();
        }
        System.out.println("La edad mínima ingresada es " + edadMinima);
        System.out.println("La edad máxima ingresada es " + edadMaxima);
    }

}
