import lang.stride.*;

public class Principal
{
    static public void main(String[] args)
    {
        Circulo circulo1 =  new  Circulo();
        circulo1.setRadio(5);
        double peric1 = circulo1.getPerimetro();
        System.out.println("Perimetro de c1: " + peric1);
        Circulo circulo2 =  new  Circulo();
        circulo2.setRadio(55);
        double peric2 = circulo2.getPerimetro();
        System.out.println("Perimetro de c2: " + peric2);
        Circulo circulo3 =  new  Circulo();
        circulo3.setRadio(35);
        double peric3 = circulo3.getPerimetro();
        System.out.println("Perimetro de c3: " + peric3);
        Circulo circulo4 =  new  Circulo();
        circulo4.setRadio(70);
        double peric4 = circulo4.getPerimetro();
        System.out.println("Perimetro de c4: " + peric4);
    }
}
