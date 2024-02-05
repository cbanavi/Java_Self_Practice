package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));

        ArrayList<Integer> list2 = new ArrayList<>();

        for (Integer each : list) {          // Iterates list of numbers
            if (!list2.contains(each)) {     // Checks if numbers from list are in list2 and adds them in.
                list2.add(each);             // Since it checks each number, if duplicate shows up, the != doesn't allow in list
            }
        }
        System.out.println(list2);
    }
}

/*
8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]

 */