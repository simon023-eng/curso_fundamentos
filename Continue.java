public class Continue
{
    public static void main(String[] args){
        int suma = 0;
        int i = 0;
        
        while(i < 6){
            i++;
            if(i == 4 || i == 5){
                continue;            
            }
            suma = suma + i; 

        }
        System.out.println("Suma: "+suma);
    }
}