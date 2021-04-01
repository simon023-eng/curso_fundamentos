import java.net.*;
import java.io.*;
public class compras
{
    public static void main(String [] args) throws Exception
    {
    String rutaJumbo = •https:"www.ktronix.com/computadores-tablets/computadores-portatiles/c/BI_104_KTRON";
    URL url = new URL(rutaJumbo);
    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
    String codigoFuente = "";
    String linea;
    while((linea = reader.readLine()) != null){
        codigoFuente = codigoFuente + linea;
    }
    reader.close();
    System.out.println(codigoFuente);
    
   
    
    
   }
}