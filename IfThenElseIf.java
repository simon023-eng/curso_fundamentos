import java.util.Scanner;
public class IfThenElseIf
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int temp = scan.nextInt();
 
        if(temp > 27){
            System.out.println("Comprar helado (cerveza)");  
        } else if(temp > 24){
            System.out.println("Comprar gaseosa");
        }else{
            System.out.println("Comprar leche"); 
        }
            System.out.println("Fin programa"); 
    }
}