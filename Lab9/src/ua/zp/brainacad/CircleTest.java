package ua.zp.brainacad;

public class CircleTest {

    public static void main(String[] args) {


        Circle c1 = new Circle(10);
        Circle c2 = new Circle(21.2, "Зеленый");

        System.out.println(c1);
        c1.infoCircle();
        c2.infoCircle();
    }
}