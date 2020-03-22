package com.company;

public class LessonThree {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();

    }

    public static void taskOne() {
        byte a = 10;
        short b = 100;
        int c = 1000;
        long d = 10000;
        float e = 100000;
        double f = 1000000;
        char g = 'a';
        boolean h = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

    public static void taskTwo() {
        byte a = 127;
        System.out.println((short)a);

        short b = 1000;
        System.out.println((int) b);

        int c = 1000000;
        System.out.println((long)c);

        int d = 15000;
        System.out.println((double)d);

        short e = 10000;
        System.out.println((float)e);

        float f = 100;
        System.out.println((double)f);

        char g = 'G';
        System.out.println((int)g);
    }

    public static void taskThree(){
        int a = 1000000000;
        float b = a;
        System.out.println(a);
        System.out.println(b);

    }

    public static void taskFour(){
        byte a = 127;
        a++;
        System.out.println(a);
    }

    public static void taskFive(){
        int num =18;
        System.out.println(num%2==0 ?"Четное": "Нечетное");
    }
}
