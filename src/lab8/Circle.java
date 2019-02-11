package lab8;

public class Circle extends graphicObject {
    private double r;
    final double PI = 3.14;

    @Override
    void draw() {
        System.out.println("Drawing Circle...");

    }

    @Override
    double findArea() {
        return this.PI*(r*r);
    }
    public Circle(double r){
        this.r = r;
    }

}//class