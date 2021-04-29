import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);

        System.out.print("Por favor indique el numero de pisos del edificio: ");
        int NumPisos = scan.nextInt();

        System.out.print("Por favor indique la cantidad de espacios de parqueo por piso: ");
        int NumEspacios = scan.nextInt();

        int tamano = Vehiculo.tamano;
        int cantidad = 0;
        Vehiculo.vehiculos = new Vehiculo[NumPisos][NumEspacios];
        Sensor.sensors = new Sensor[NumPisos][NumEspacios];
        Sensor.inicilizacionArreglo();
        //o Si se ingresa el número 1, se imprimen los sensores desocupados
        //recorrer  array de objeto Puesto ir posicion por posicio y validar  if(sensores[i][j]== null)). si es igual imprime libre y la posicion i J
        int opción = 0;

        do{
            opción = menú();

            switch (opción)
            {
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1: // buscar

                    for (int fila = 0; fila < NumPisos; fila++){
                        for (int col = 0; col < NumEspacios; col++){
                            if  (Sensor.sensors[fila][col].getStatus() == 0 ){
                                System.out.println("Libre: Piso " + (fila+1) + "Espacio " + (col+1) );
                            }
                        }
                    }
                    break;


                case 2: // se solicita al usuario en que piso y espacio desea parquear el usuario,
                    //si el espacio está ocupado se le informa al usuario que no se puede realizar la acción, de lo contrario,
                    //se le solicita la información de placa, marca y color, creando así el vehículo.
                    //Para el sensor asociado su estado debe cambiar de 0 a 1 (Libre a Ocupado)
                    System.out.println("¿En que piso y espacio desea parquear?");
                    int i = scan.nextInt()-1;
                    int j = scan.nextInt()-1;
                    String p,m,c;
                    int e;
                    if((Sensor.sensors[i][j] == null)||(Sensor.sensors[i][j].getStatus() == 0)){
                        System.out.println("Ingrese la placa, la marca y el color");
                        p = scan.next();
                        m = scan.next();
                        c = scan.next();
                        e = 1;
                        Sensor.sensors[i][j].setStatus(1);
                        Vehiculo.vehiculos[i][j]=new Vehiculo(p,m,c);
                        System.out.println(Vehiculo.vehiculos[i][j].toString());
                    }else{
                        System.out.println("No se puse realizar esta opción");
                    }
                    break;
                case 3: // añadir
                    //añadir(listatfnos);
                    System.out.println("¿En que piso y espacio desea parquear?");
                    int i2 = scan.nextInt()-1;
                    int j2 = scan.nextInt()-1;
                    String p2,m2,c2;
                    int v2,e2;
                    if((Sensor.sensors[i2][j2] == null)||(Sensor.sensors[i2][j2].getStatus() == 0)){
                        System.out.println("Ingrese la placa, la marca, el color y el valor comercial");
                        p2 = scan.next();
                        m2 = scan.next();
                        c2= scan.next();
                        v2 = scan.nextInt();
                        e2 = 1;
                        Sensor.sensors[i2][j2]=new Sensor(e2);
                        Vehiculo.vehiculos[i2][j2]=new Vehiculo(p2,m2,c2,v2);
                        System.out.println(Vehiculo.vehiculos[i2][j2].toString());
                    }else{
                        System.out.println("No se puse realizar esta opción");
                    }
                    break;

                case 4:
                    int i3 = 0;
                    int j3 = 0;
                    System.out.println(Vehiculo.vehiculos[i3][j3].toStringVehiculos() + "\n");
                    break;

                case 5:
                    System.out.println("Cantidad de vehiculos ingresados:  " + Vehiculo.cantidadVehiculos());
                    break;

                case 6:

                    System.out.println("Ingrese el piso y el espacio que desea saber");
                    int i4 = scan.nextInt()-1;
                    int j4 = scan.nextInt()-1;

                    if ((Sensor.sensors[i4][j4] == null)||(Sensor.sensors[i4][j4].getStatus() == 0))
                    {
                        System.out.println("Libre");
                    }
                    else
                    {
                        System.out.println("Ocupado");
                        System.out.println(Sensor.sensors[i4][j4].toString());
                    }
                    break;

                case 7:

                    System.out.println(Sensor.sensoresEstado());
                    break;

                case 8:
                    System.out.println("Ingrese un color ¿que desea buscar?");
                    String colorRecibido = scan.next();
                    System.out.println(Vehiculo.buscarColor(colorRecibido));
                    break;
                case 9:
                    System.out.println(Vehiculo.ordenarVehiculos());
                    break;

                default:
                    System.out.println("Comando incorrecto");
                    break;
            }
        } while(opción != 0);
    }
    //metodo Menu
    public static int menú(){

        Scanner scan= new Scanner(System.in);
        //System.out.print("\n\n");
        System.out.println("0. Salir");
        System.out.println("1. Buscar puestos libres");
        System.out.println("2. Agregar vehiculo sin valor comercial");
        System.out.println("3. Agregar vehiculo con valor comercial");
        System.out.println("4. Imprimir todos los vehiculos");
        System.out.println("5. Cantidad de vehiculos ingresados");
        System.out.println("6. Estado de un puesto en especifico");
        System.out.println("7. Estado de todos los puestos");
        System.out.println("8. Ponga un color y se mostrara los carros que posean el mismo");
        System.out.println("9. Ordenamiento por valor comercial");
        System.out.print("   Opción: ");
        int op;
//        do
            op = scan.nextInt();
//            //op = Leer.datoInt();
//        while (op < 0 || op > 9);
//        while (op != 0);
        return op;
    }
}
