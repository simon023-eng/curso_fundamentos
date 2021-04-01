import java.util.Scanner;
public class cosmic
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int contador = 0;
        for(int i=0;i<x.length();i++){
            if(x.charArt(i)=="a"){
                contador ++;
            }
        }
        System.out.println(contador);
    }
}