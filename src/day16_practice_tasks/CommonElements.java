package day16_practice_tasks;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {

        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();

        set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0));
        set2.addAll(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        Set<Integer> set3 = new TreeSet<>();

        for (Integer eachSet1 : set1) {
            for (Integer eachSet2 : set2) {

                if (eachSet1.equals(eachSet2)) {
                    set3.add(eachSet2);
                }

            }
        }

        System.out.println(set3);

    }

}

/*
3. Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */