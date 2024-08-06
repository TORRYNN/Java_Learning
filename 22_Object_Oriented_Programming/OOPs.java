public class OOPs {
    public static void main(String[] args) {
        Pen p1=new Pen("Red",1);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        Pen p2=new Pen("Red",2);
        System.out.println(p2.getColor());
        System.out.println(p2.getTip());

    }
    
}

class Pen{
    String color;
    int tip;
    public Pen(String color, int tip){
        this.color = color;
        this.tip = tip;
    }
    
    public String getColor(){
        return color;
    }
    public int getTip(){
        return tip;
    }
}
