
public class Circle extends Shape{

    private double reduis;

    // Constructors
    public Circle(int x, int y, double reduis) {
        super(x, y);
        this.reduis = reduis;
    }

    public Circle(double reduis) {
        this.reduis = reduis;
    }

    public Circle(){

    }

    // setter , getter
    public double getReduis() {
        return reduis;
    }

    public void setReduis(double reduis) {
        this.reduis = reduis;
    }

    // Abstract Methods
    @Override
    public double calculateArea() {
        return 3.14*reduis*reduis;
    }

    @Override
    public double calculateCircumference() {
        return 3.14*2*reduis;
    }
}
