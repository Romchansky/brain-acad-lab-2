/**
 * Эта программа отображает слово World в столбик.
 * Так же отображает слово World после каждой буквы табуляция.
 * @ author Roman Petrenko
 */

package ua.zp.braincad;

public class ItemThree {
    public static void main(String[] args) {
        String s = "\n Hello".repeat(5);
        System.out.println(s);
        System.out.println("\tW\to\tr\tl\td");
    }

}
