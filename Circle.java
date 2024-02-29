public class Circle {
    private double radius;
    private String color;
    private double area;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = radius * radius * 3.14f;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                +
                radius
                +
                " and color is "
                + color
                + " , area = " +
                area;
    }

}
