package lab8;

public abstract class graphicObject {
    private String color;
    abstract void draw();
    abstract double findArea();

    //string

    @Override
    public String toString() {
        return "graphicObject{" +
                "color='" + color + '\'' +
                '}';
    }

    //set

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//class
