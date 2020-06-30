package ua.zp.brainacad;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        /**
         * Create String different variables
         * #1
         */

        String s1 = "Hello world";

        String s2 = new String("Hello world");

        char[] s3 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        String s4 = new String(s1.getBytes());

        StringBuilder s5 = new StringBuilder("Hello world");

        /**
         * Work with the String
         * #2
         */

        String fruit = "Апельсин,Яблоко,Гранат,Груша";
        String[] strings = fruit.split(" ", 4);
        int maxLenght = 0;
        int indexMaxLenght = 0;
        for (int i = 0; i < strings.length; i++) {
            if (maxLenght < strings[i].length()) {
                maxLenght = strings[i].length();
                indexMaxLenght = i;
            }
            System.out.println(strings[indexMaxLenght].toLowerCase());


            String s8 = "Я_новая_строка";
            s8.trim();
            s8.replace('_', ' ');
            System.out.println(s8);

            Scanner sc = new Scanner(System.in);
            System.out.println("Вы ввели: " + sc.nextLine());

            switch (sc.nextLine().toUpperCase()) {
                case "запуск":
                    System.out.println("Запускаем процесс");
                    break;
                case "завершен":
                    System.out.println("Процесс завершен");
                    break;
                case "ошибка":
                    System.out.println("Произошла ошибка");
                    break;
                default:
                    System.out.println("Введены некорректные данные");
                    break;
            }


            /**
             * Create StringBuilder
             * #4
             */


        }
    }
}

