package ua.zp.brainacad;

import java.util.Arrays;

public class ArrayExceptionTest {
    public static void main(String[] args) {

        /**
         * создание и инициализация массива
         * вывод массива через метод printArray
         */
        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println(Arrays.toString(array));
        printArray(array, 0, 6);
        printArray(array, 2, 7);
        printArray(array, 1, 4);
        printArray(array, 0, 5);
        printArray(array, 1, 2);
    }

    /**
     * @param array      массив передаваемій в метод
     * @param startIndex начальный индекс вывода масиива
     * @param endIndex   окончательный индекс вывода массива
     *                   в блоке try происходит вывод каждого елемента массива
     *                   блок catch ловит ошибку если введен индекс больший нежели длина самого массива
     */
    public static void printArray(String[] array, int startIndex, int endIndex) {
        try {
            for (int i = startIndex; i < endIndex; i++) {
                System.out.println(array[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = " + endIndex + " размер массива = " + array.length);
        }
    }
}

