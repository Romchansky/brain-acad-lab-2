package ua.zp.brainacad;

/**
 * Класс Circle
 * Первым шагом происходит объявление полей класса.
 * Создаются два конструктора которые принимают на вход разное количество параметров.
 * Создаем метод для вывода информации в консоль о каждом из объектов.
 * Переопределяем параметр radius для правильного вывода в консоли в классе Pizzeria
 * @author Roman Petrenko
 */



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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

