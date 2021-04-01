public class SensorLuz
{
 
    private int intensidadMin;
    private int intensidadMax;
    private int intensidad;
 
    public SensorLuz(int min, int max){
        this.intensidadMin = min;
        this.intensidadMax = max;
        this.intensidad = min;
    }
 
 
    public void setIntensidad(int i){
        if(i >= intensidadMin && i <= intensidadMax){
            this.intensidad = i;
        }else{
            System.out.println("Valor no está dentro del rango permitido");
        }
    }
 
    public int getIntensidad(){
        return this.intensidad;
    }
 
    public int duplicarIntensidad(){
        int duplicado = intensidad * 2;
        if(duplicado >= intensidadMin && duplicado <= intensidadMax){
            this.intensidad = duplicado;
        }
        else{
            System.out.println("Valor duplicado no está dentro del rango permitido");
        }
        return this.intensidad;
    }
}