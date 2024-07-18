

public class Triangle extends Shape {
    private double hight;
    public double base;

    // setter , getter
    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // constructers
    public Triangle(double hight, double base) {
        this.hight = hight;
        this.base = base;
    }

    public Triangle(){

    }

    // Abstract Methods
    @Override
    public double calculateArea() {
        return hight*base*0.5;
    }

    @Override
    public double calculateCircumference() {
        double T=(hight*hight+base*base)*(hight*hight+base*base);
        return T*3;
    }
}
