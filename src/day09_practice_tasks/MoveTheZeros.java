package day09_practice_tasks;

import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0, -8};
        int[] moveZeroRight = new int[array.length];

        int j = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                moveZeroRight[j++] = array[i];
            }
        }

        System.out.println(Arrays.toString(moveZeroRight));


    }
}
/*
9. Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};
 */