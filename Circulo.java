public class Circulo
{
    //Atributos
    private double radio;
    
    //Metodos
    public void setRadio(double r){
        this.radio = r;
    }
    
    public double getRadio(){
        return this.radio;
       
    }
    
    public double getPerimetro(){
        return 2 * this.radio * Math.PI;
    }
}
