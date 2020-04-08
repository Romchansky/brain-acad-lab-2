package ua.zp.brainacad;

public class CircleTest {

    public static void main(String[] args) {


        Circle c1 = new Circle(10);
        Circle c2 = new Circle(21.2, "Зеленый");

        c1.infoCircle();
        c2.infoCircle();
    }
}