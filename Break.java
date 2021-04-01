public class Break
{
    public static void main(String[] args){
        int dinero = 10;
        int precio_entrada = 3;
        int entradas_compradas = 0;
        
        while(entradas_compradas < 100){
            System.out.println("Vamos a verificar si puedes comprar");
            if (dinero >= 3){
                entradas_compradas++;
                dinero = dinero - precio_entrada;
            }else{
                break;
            }
        }
        System.out.println("Dinero sobrante: " + dinero);
        System.out.println("Entradas compradas: " + entradas_compradas);
    }
}