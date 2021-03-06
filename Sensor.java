public class Sensor
{
    public static Sensor sensors[][];
    private int status;

    public Sensor()
    {
        this.status = 0;
    }

    public Sensor( int e)
    {
        this.status = e;
    }

    public void setStatus(int estado)
    {
        this.status = estado;
    }

    public int getStatus()
    {
        return status;
    }

    public String toString()
    {
        return "Estado "+(getStatus() == 0?"Libre":"Ocupado"); // ternary operator
    }

    public static String sensorLibre()
    {
        String valor = "";
        for(int i = 0; i<sensors.length; i++)
        {
            for (int j = 0; j<sensors[0].length; j++)
            {
                if ((sensors[i][j] == null)||(sensors[i][j].getStatus() == 0))
                {
                    valor += "Piso " + i + " y espacio " + j + "\n";
                }
            }
        }
        return valor;
    }

    public static String sensoresEstado()
    {
        String valor1 = "";
        for(int i = 0; i<sensors.length; i++)
        {
            for (int j = 0; j<sensors[0].length; j++)
            {
                valor1 += "Piso " + (i+1) + " y espacio " + (j+1) + sensors[i][j].toString()+"\n";
            }
        }
        return valor1;
    }

    public static void inicilizacionArreglo()
    {
        for(int i = 0; i<sensors.length; i++)
        {
            for (int j = 0; j<sensors[0].length; j++)
            {
                sensors[i][j] = new Sensor();
            }
        }
    }
}
