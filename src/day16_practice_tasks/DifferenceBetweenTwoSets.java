package day16_practice_tasks;

import java.util.*;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();

        set1.addAll(Arrays.asList(1, 2, 3, 5));
        set2.addAll(Arrays.asList(2, 3, 4));

        set1.removeAll(set2);

        System.out.println(set1);

    }

}

/*
4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}
 */