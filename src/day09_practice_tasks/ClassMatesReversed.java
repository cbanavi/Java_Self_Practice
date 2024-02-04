package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {


        String[] classMates = {"Chiyavan Banavi", "Jen Nest", "Alexandru Alexandrov", "Pendar Shamsollahi", "Faranak Davoodzadeh"};

        for (int i = 0; i < classMates.length; i++) {
            String reverseName = "";

            for (int j = classMates[i].length() - 1; j >= 0; j--) {
                reverseName += classMates[i].charAt(j);
            }

            System.out.println(reverseName);
        }


    }
}
/*
6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */