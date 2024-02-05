package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        ArrayList<Integer> uniqueElements = new ArrayList<>(list); //You can add another ArrayList to the () to copy it into new list

        System.out.println(uniqueElements);

        uniqueElements.removeIf(p -> Collections.frequency(uniqueElements, p) > 1); //If an element, p,  appears more than once, don't add to list

        System.out.println(uniqueElements);


    }
}

/*
9. Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]
 */