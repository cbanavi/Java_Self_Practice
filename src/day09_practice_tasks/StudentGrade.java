package day09_practice_tasks;

import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

//4.1:
        String[] studentNames = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[studentNames.length];
//4.2:
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90 && scores[i] <= 100) {
                grades[i] = 'A';
            } else if (scores[i] >= 80 && scores[i] <= 89) {
                grades[i] = 'B';
            } else if (scores[i] >= 70 && scores[i] <= 79) {
                grades[i] = 'C';
            } else if (scores[i] >= 60 && scores[i] <= 69) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
//4.3:
            System.out.println(studentNames[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }
        System.out.println(Arrays.toString(grades));
    }

}
/*
4. Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   4.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */