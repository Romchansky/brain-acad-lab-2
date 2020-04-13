package ua.zp.brainacad;

/**
 * Класс Circle
 * Первым шагом происходит объявление полей класса.
 * Создается конструктор с принимающими параметрами и использованием параметра radius с конструктора Circle из класса Circle .
 * Создаем метод для вывода информации в консоль о каждом из объектов.
 * Переопределяем в строку параметры для правильного отображения информации в классе Pizzeria
 * @author Roman Petrenko
 */

public class Pizza {
    public String name;
    public Circle basis;
    public double weight;
    public String composition;
    public double cost;



    public Pizza(String name,double weight, String composition, double cost, double diameter) {
        this.name = name;
        this.basis = new Circle(diameter/2);
        this.weight = weight;
        this.composition = composition;
        this.cost = cost;


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", basis=" + basis +
                ", weight=" + weight +"г"+
                ", composition=" + composition +
                ", cost=" + cost +"грн"+
                '}';
    }
}

