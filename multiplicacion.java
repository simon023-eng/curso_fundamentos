public class multiplicacion
{
    public static void main(String[] args){
        System.out.println("Tabla de multiplicar");
        System.out.println("1 2 3 4 5 6 7 8 9");
        for(int i=1;i<=9;i++){
            System.out.println(i +"|");
            for(int j=1; j<=9; j++){
                System.out.println(i*j*"");
            }
            System.out.println();
        }
    }
}

 