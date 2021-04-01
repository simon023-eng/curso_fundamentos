public class this1{
    public Point(){
        this(0,0);
    }
    public point(){
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public point(point p2){
        this(p2.getX(),p2.getY());
        
   