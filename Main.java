
public class Main {

    public static void main(String[] args) {

       Circle circle1=new Circle(2.5);
       circle1.setX(4);  circle1.setY(3);

       Triangle triangle1=new Triangle(1.4 , 2.1);
       triangle1.setX(2); triangle1.setY(5);

       Rectangle rectangle1=new Rectangle(2.0,1.0);
       rectangle1.setX(4);  rectangle1.setY(2);

       System.out.println();
       System.out.println(" Circle X Y: "+circle1.getX()+ " ,"+circle1.getY());
       System.out.println(" Circle raduis: "+circle1.getReduis());
       System.out.println(" Calculated Circle Area: "+circle1.calculateArea());
       System.out.println(" Calculated Circle Circumference: "+circle1.calculateCircumference());
       System.out.println();
       System.out.println(" Reactangle  X Y : "+rectangle1.getX()+" , "+rectangle1.getY());
       System.out.println(" Rectangle Wight: "+rectangle1.getWidth());
       System.out.println(" Rectangle hight: "+rectangle1.getHight());
       System.out.println(" Clalculated Rectangle Area: "+rectangle1.calculateArea());
       System.out.println(" Clalculated Rectangle Circumference: "+rectangle1.calculateCircumference());
       System.out.println();
       System.out.println(" Triangle  X Y : "+triangle1.getX()+" , "+triangle1.getY());
       System.out.println(" Triangle hight: "+triangle1.getHight());
       System.out.println(" Trinagle base: "+triangle1.getBase());
       System.out.println(" Calculated Triangle Area: "+triangle1.calculateArea());
       System.out.println(" Calculated Triangle Circumference: "+triangle1.calculateCircumference());
       System.out.println();

    }
}