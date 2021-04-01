import java.util.*;
public class PrincipalSensor
{
    public static void main(String args[]){
 
        SensorLuz sl1 = new SensorLuz(18,40);
        Scanner scan = new Scanner(System.in);
        String opcion = scan.next();
 
        do{
 
        System.out.println("Ingrese una opción: duplicar, asignarint o salir");
 
        switch (opcion) {
            case "duplicar":
            System.out.println("La intensidad del sensor es: "+sl1.getIntensidad());
            sl1.duplicarIntensidad();
            System.out.println("La nueva intensidad del sensor es: "+sl1.getIntensidad());
            break;
 
            case "asignarint":
            System.out.println("Usuario ingrese la nueva intensidad");
            int nuevo = scan.nextInt();
            sl1.setIntensidad(nuevo);
            System.out.println("La intensidad del sensor es: "+sl1.getIntensidad());
            break;
 
            default:
            System.out.println("Comando desconocido");
            break;
        }
 
        opcion = scan.next();
 
        }
        while(!opcion.equals("salir"));
 
 
 
    }
 
}