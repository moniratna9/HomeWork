import java.util.Arrays;
import java.util.Scanner;

public class thrusdaysHomeWork {
    public static void main(String[] args) {
        System.out.println(reverseArray());
        System.out.println(Arrays.toString(reverseNumbers(new int[]{25, 15, 3, 2, 40})));
        System.out.println(sumOfArray(new int[]  {20, 10, 40, 44}));
        System.out.println(Arrays.toString(sortAnArray()));
        System.out.println( averageOfAnArray());
        System.out.println(maxNum());
        System.out.println( minNum());
        System.out.println(abbreviation());
        System.out.println(sumOfNum(5));
        System.out.println(bestStudent(new String[]{"Happy", "Peace", "Jesse", "Kaitlin", "Amir", "Donald", "Steven", "Vicky",
                "Hannah", "David", "Gia" }, new double[]{90.0, 89.0, 91.0, 67.0, 87.0, 88.0, 93.0, 90.0, 100.0, 81.0, 54.0}));
    }

    public static String reverseArray() {
        String word = "Sample";
        int wordLen = word.length();
        String reversed = "";
        for (int i = 0; i <= wordLen - 1; i++) {
            reversed = reversed + word.charAt(wordLen - 1 - i);

        }
        ;
        return reversed;
    }

    public static int[] reverseNumbers(int[] numbers) {
       // numbers = new int[]{25, 15, 3, 2, 40};
        int numberLen = numbers.length;
        int[] reverse = new int[numberLen];
        for (int i = 0; i <= numbers.length - 1; i++) {
            int num = numbers[numberLen - 1 - i];
            reverse[i] = num;
        }
        return reverse;


    }

    public static int sumOfArray(int[] num) {
        //int[] num = {20, 10, 40, 44};
        int sum = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            sum = sum + num[i];
        }
       // System.out.print("Summation of given array is ");
        return sum;

    }

    public static int[] sortAnArray() {
        int[] num = {20, 10, 40, 44};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        return num;
    }

    public static double averageOfAnArray() {
        int[] numbers = {20, 10, 40, 44};
        double avg = sumOfArray(numbers) / numbers.length;
        return avg;
    }

    public static int maxNum() {
        int[] numbers = {20, 10, 40, 44, 32};
        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }

        }
        return maxNum;

    }

    public static int minNum() {
        int[] numbers = {20, 10, 40, 44, 32};
        int minNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }
        return minNum;
    }

    public static String abbreviation() {
        String sentence = "Happy new year";
        String abbr = "";
        String[] sen = sentence.split(" ");
//        for (int i = 0; i < sen.length; i++) {
//            String s = sen[i];
        for (String s : sen) {
            abbr = abbr + s.charAt(0);
        }
        return abbr;


    }

    public static int sumOfNum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static String bestStudent(String[] students, double[] marks) {
        double maxNum = marks[0];
        int index = 0;
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > maxNum) {
                maxNum = marks[i];
                index = i;
            }

        }
        return students[index];
    }
}