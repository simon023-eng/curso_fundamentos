import java.util.Scanner;
public class entradaysalida
{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int[] arr_edades = new int[100];
System.out.println("Ingrese el valor de las edades a asignar:");
System.out.println("Valores válidos de 1 a 100:");
int cant_edades = scan.nextInt();
int [] arr_edades = new int[cant_edades];

for(int i=0; i<edades; i++){
System.out.println("Ingrese el valor de la edad "+ (i+1));
arr_edades[i] = scan.nextInt();
}

for(int i=0; i<edades; i++){
System.out.println(arr_edades[i]);
}


}