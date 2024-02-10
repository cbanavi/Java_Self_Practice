package day09_practice_tasks;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {

//      1.1:
        int[] integers = new int[100];

//      1.2:
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i + 1;
        }
        System.out.println(Arrays.toString(integers));
        System.out.println("-------------------");

//      1.3:
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }

        System.out.println();
        System.out.println("-------------------");

//      1.4:
        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.print(integers[i] + " ");
        }

        System.out.println();
        System.out.println("-------------------");

//      1.5:
        for (int each : integers) {
            if (each % 5 == 0) {
                System.out.print(each + " ");
            }
        }

    }

}

/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */