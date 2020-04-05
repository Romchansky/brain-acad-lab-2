package ua.zp.brainacad;

import static java.lang.System.*;

public class LessonFour {
    public static void main(String[] args) {


        logicalExpressions();
        numbers();
        daysOfWeek();
        numbersFactorial();
        evenThreeNum();


    }


    private static void logicalExpressions() {
        boolean a = true && false || true && !false; // false || true => true
        out.println(a);
        boolean b = false || false && !true && false; //  false && false => false
        out.println(b);
        boolean c = !false && (false || true && true); // !false && true => true
        out.println(c);
        boolean d = 4 > 8 && !(7 == 0); // false && false => false
        out.println(d);
        boolean e = !(true && false || false && true) && !(true && 4 <= 5); //  true && false => false
        out.println(e);

    }

    private static void numbers() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                out.println(i + " -> Четное");
            } else {
                out.println(i + " -> Нечетное");
            }
        }
    }

    private static void daysOfWeek() {
        String daysArray[] = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        for (int i = 0; i < daysArray.length; i++) {
            if (i == 5 || i == 6) {
                out.println(daysArray[i] + " -> " + "Выходной день");
            } else {
                out.println(daysArray[i] + " -> " + "Рабочий день");
            }
        }
    }

    private static void numbersFactorial() {
        int x = 7;
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
            if (result > 1000) {
                out.println("Достигнут максимально возможный лимит");
                return;
            }
            out.println(result);
        }

    }

    private static void evenThreeNum() {

        for (int i = 1; i < 128; i++) {
            if (i % 3 == 0) out.println(i);
        }
    }
}


