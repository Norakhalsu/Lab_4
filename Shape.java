
public abstract class Shape {

     // represent the coordinates of the center of the shape
     private int x;
     private int y ;

     // Abstract Methods
    public abstract double calculateArea();
    public abstract double calculateCircumference();

    // Constructor
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }




}
