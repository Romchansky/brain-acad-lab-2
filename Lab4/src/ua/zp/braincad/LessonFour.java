package ua.zp.braincad;

import static java.lang.System.*;

public class LessonFour {
    public static void main(String[] args) {

        cycleFor();
        logicalExpressions();

    }

    public static void cycleFor() {
        for (int i = 0; i < 10; i++) {
            out.println(i);
        }
    }

    public static void logicalExpressions() {
        boolean a = true && false || true && !false; // false || true => true
        out.println(a);
        boolean b = false || false && !true && false; //  false && false => false
        out.println(b);
        boolean c = !false && (false || true && true); // !false && true => true
        out.println(c);
        boolean d = 4>8 && !(7==0); // false && false => false
        out.println(d);
        boolean e = !(true && false || false && true) && !(true && 4<=5); //  true && false => false
        out.println(e);


    }

}
