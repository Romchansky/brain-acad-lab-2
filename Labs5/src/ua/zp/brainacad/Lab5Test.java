package ua.zp.brainacad;

import java.util.Arrays;


/**
 * This is prototype for Lab 4.
 */
public class Lab5Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray; // TODO init it's array by new with size 4.
        firstArray = new float[4];
        firstArray[0] = 1;
        firstArray[3] = 25;

        // TODO insert some value to start of array and to end of array.

        int[] intArray = {1, 45, 4, 5, 57, 5, 13}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)

        int[] intArrayCopy = {}; // TODO copy "intArray". Use copyOf...
        intArrayCopy = Arrays.copyOf(intArray, intArray.length);
        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.

        Arrays.sort(intArrayCopy);
        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.

        System.out.println(Arrays.toString(intArrayCopy));
        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".

        Arrays.equals(intArray, intArrayCopy);
        if (intArray == intArrayCopy) {
            System.out.println("Arrays equals");
        } else {
            System.out.println("Arrays not equals");
        }


        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.println(value + " ");
        }

        // 2.1)
        // TODO calc sum of all array elements and print result.

        int[] testArraySum = {};
        testArraySum = Arrays.copyOf(testArray, testArray.length);
        int sumArr = 0;
        for (int value : testArraySum) {
            sumArr += value;
            System.out.println(value + " = " + sumArr);
        }

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.

        int[] testArrayOddIndex = Arrays.copyOf(testArray,testArray.length);
        int sumNumOdd = 0;
        for (int i = 0; i < testArrayOddIndex.length; i++) {
            if (testArrayOddIndex[i] % 2 == 0) {
                continue;
            } else sumNumOdd += testArrayOddIndex[i];
            System.out.println(sumNumOdd);
        }


        // 2.3)
        // TODO find max value in array.

        int[] testArrayMaxValue = Arrays.copyOf(testArray,9);
        int maxIndex = 0;
        for (int i = 0; i <testArrayMaxValue.length ; i++) {
            if(testArrayMaxValue[i]>maxIndex)
                maxIndex = testArrayMaxValue[i];
        }
            System.out.println(maxIndex);

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]

        int [][] ArrayDouble = new int[3][4];
        for (int i = 0; i <ArrayDouble.length; i++) {
            for (int j = 0; j <ArrayDouble[i].length ; j++) {
                System.out.printf("%d",ArrayDouble [i] [j]);
            }
            System.out.println();
        }
        //3.2
        // TODO fill array with any numbers in cycles.

        for (int i = 0; i <ArrayDouble.length; i++) {
            for (int j = 0; j < ArrayDouble[i].length; j++) {
                ArrayDouble[i][j] = i + 1 + j + 2;
                System.out.printf("%d", ArrayDouble[i][j]);
            }
            System.out.println();
        }
        //3.3
        // TODO calc sum of all array elements and print result.

        long sumArrayDouble = 0;
        for (int i = 0; i <ArrayDouble.length; i++) {
            for (int j = 0; j < ArrayDouble[i].length; j++) {
                sumArrayDouble+= ArrayDouble[i][j] ;
            }
        }System.out.println(sumArrayDouble);

        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.

        for (int i = 2; i <=5 ; i++) {
            if(i%3==0){
                
            }

        }
        System.out.println(sum);

    }

}


