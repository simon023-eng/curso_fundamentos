import java.util.Scanner;
public class Principal1{
public static void main(String[] args) {
   Scanner scan = new Scanner (System.in);
   System.out.println("Ingrese el radio: ");
   Circulo circulo1 = new Circulo();
   double radio = scan.nexDoblue();
   
   if(radio>0){
       System.out.println(radio);
       System.out.println("Radio circulo1: "+circulo1.getRadio());
    }
    else{
        System.out.println("Error ¿de que me hablas viejo?");
    }
    System.out.println("Fin programa")
}
 