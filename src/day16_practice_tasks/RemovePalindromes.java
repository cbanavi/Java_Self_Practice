package day16_practice_tasks;

import java.util.*;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));

        String reverseList = new StringBuilder(list.toString()).reverse().toString();


        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if (reverseList.contains(temp)) {
                it.remove();
            }
        }

        System.out.println(list);



//        for (String each : list) {
//            for (char eachChar : each.toCharArray()) {
//                characters.push(eachChar);
//            }
//        }
//
//        String reverse = "";
//
//        while (!characters.isEmpty()) {
//            reverse += characters.pop();
//        }
//
//        System.out.println(reverse);

    }

}

/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}
 */