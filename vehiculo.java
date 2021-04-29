public class Vehiculo
{
    public static Vehiculo vehiculos[][];
    public static int tamano;
    public static int cantidad= 0;

    private String placa;
    private String marca;
    private String color;
    private int valorComercial;

    public Vehiculo()
    {
    }

    public Vehiculo(String p, String m, String c)
    {
        this(p,m,c,300000000);
    }

    public Vehiculo(String p, String m, String c, int v)
    {
        this.placa= p;
        this.marca= m;
        this.color= c;
        this.valorComercial= v;
        cantidad++;
    }

    public void setPlaca(String p)
    {
        this.placa= p;
    }

    public void setMarca(String m)
    {
        this.marca= m;
    }

    public void setColor(String c)
    {
        this.color= c;
    }

    public void setValorComercial(int v)
    {
        this.valorComercial= v;
    }

    public String getPlaca()
    {
        return this.placa;
    }

    public String getMarca()
    {
        return this.marca;
    }

    public String getColor()
    {
        return this.color;
    }

    public int getValorComercial()
    {
        return this.valorComercial;
    }

    public String toString()
    {
        return "Placa " + getPlaca() +" Marca " + getMarca() + " Color " + getColor() + " Valor Comercial " + getValorComercial() + "\n";
    }

    public void totalDeParqueaderos (int t, int ca)
    {
        tamano = t*ca;
        vehiculos = new Vehiculo [t][ca];
    }

    public static String toStringVehiculos ()
    {
        String all = "";
        for(int i = 0; i<vehiculos.length; i++)
        {
            for (int j = 0; j<vehiculos[0].length; j++)
            {
                if (vehiculos[i][j] != null)
                {
                    all += vehiculos[i][j].toString();
                }
            }
        }
        return all;
    }


    public static int cantidadVehiculos ()
    {
        return cantidad;
    }

    public static String buscarColor(String colorRecibido)
    {
        boolean existe = false;
        String bcolor= "";

        for(int i6 = 0; i6<vehiculos.length;i6++)
        {
            for(int j6 = 0; j6<vehiculos[0].length; j6++)
            {
                if(vehiculos[i6][j6] != null)
                {
                    if(vehiculos[i6][j6].getColor().equalsIgnoreCase(colorRecibido))
                    {
                        existe = true;
                        bcolor += vehiculos[i6][j6].toString()+"\n";
                    }
                }
            }
        }
        if(existe == false)
        {
            bcolor += "No se ha ingresado ningun vehiculo con ese color";
        }
        return bcolor;
    }

    public static String ordenarVehiculos()
    {
        String listaOrdenada = "";
        int i8 = 0;
        Vehiculo vehiculo2[] = new Vehiculo[cantidad];
        for(int i7 = 0; i7<vehiculos.length;i7++)
        {
            for(int j7 = 0; j7<vehiculos[0].length; j7++)
            {
                if(vehiculos[i7][j7] != null)
                {
                    vehiculo2[i8] = vehiculos[i7][i7];
                    i8++;
                }
            }
        }
        vehiculoOrdenado(vehiculo2);
        for(int i10 = 0; i10 <cantidad; i10++){
            listaOrdenada += vehiculo2[i10].toString() + "\n";
        }
        return listaOrdenada;
    }

    public static void vehiculoOrdenado(Vehiculo[] vehiculo2)
    {
        Vehiculo temp[] = new Vehiculo[cantidad];
        for(int i9 = 1; i9 < cantidad ; i9++){
            for(int j9 = 0; j9 < cantidad - 1; j9++){
                if(vehiculo2[j9].getValorComercial() > vehiculo2[j9+1].getValorComercial()){
                    temp[j9] = vehiculo2[j9];
                    vehiculo2[j9] = vehiculo2[j9+1];
                    vehiculo2[j9+1] = temp[j9];
                }
            }
        }
    }
}
