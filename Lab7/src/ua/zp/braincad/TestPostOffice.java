package ua.zp.braincad;

import java.util.Arrays;

public class TestPostOffice {
    public static void main(String[] args) {

        PostOffice p1 = new PostOffice();
        p1.setName("Новая почта");
        p1.setCity("Запорожье");
        p1.setStreet("Талалихина");
        p1.setNumber(46);
        p1.setWorkHours("10:00 - 20:00");
        p1.setDaysWork(new String[] {"Понедельник, Вторник, Среда, Четверг, Пятница"});
        p1.setWeekend(new String[] {"Суббота, Воскресенье"});

        System.out.println("Название: " + p1.getName());
        System.out.println("Город:" + p1.getCity());
        System.out.println("Почтовый индекс:" + PostOffice.getIndex());
        System.out.println("Название улицы:" + p1.getStreet());
        System.out.println("Номер отделения:" + p1.getNumber());
        System.out.println("Часы работы:" + p1.getWorkHours());
        System.out.println("Дни работы:" + Arrays.toString(p1.getDaysWork()));
        System.out.println("Выходные:" + Arrays.toString(p1.getWeekend()));

    }
}
