package ua.zp.brainacad;

public class Circle {
    public double radius;
    public double circumference;
    public double square;
    public String color;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Красный";
        this.circumference = 2 * Math.PI * radius;
        this.square = Math.PI * radius * radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.circumference = 2 * Math.PI * radius;
        this.square = Math.PI * radius * radius;
    }

    public void infoCircle() {
        System.out.println("Радиус: " + radius + "\nДлина окружности: " + circumference +
                "\nПлощадь окружности: " + square + "\nЦвет: " + color);
    }
}
