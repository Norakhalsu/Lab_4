
public class Rectangle extends Shape{

    private double hight;
    private double width;

    // setter , getter
    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // constructers
    public Rectangle(double hight, double width) {
        this.hight = hight;
        this.width = width;
    }

    public Rectangle(){

    }

    // Abstract Methods
    @Override
    public double calculateArea() {
        return hight*width;
    }

    @Override
    public double calculateCircumference() {
        return 2*(hight+width);
    }

}
