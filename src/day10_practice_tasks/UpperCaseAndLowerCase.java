package day10_practice_tasks;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        String isUpperCase = "";
        String isLowerCase = "";


        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                isUpperCase += each;
            }
            if (Character.isLowerCase(each)) {
                isLowerCase += each;
            }
        }

        boolean isEqual = (isUpperCase.length() == isLowerCase.length());
        System.out.println(isEqual);
    }
}

/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */