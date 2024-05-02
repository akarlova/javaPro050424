package app.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("bird");
        words.add("tiger");
        words.add("bird");
        words.add("lion");
        words.add("book");
        words.add("book");
        words.add("cat");
        words.add("human");
        words.add("robot");
        words.add("robot");
        words.add("robot");

        int[] numbers = {1, 40, 3, 5, 5, 1, 7, 8, 9, 100, 1, 35, 24};

        countOccurrence(words, "bird");
        System.out.println(toList(numbers));
        findUnique(toList(numbers));
        calcOccurrence(words);
        findOccurrence(words);
    }

    private static void countOccurrence(List<String> words, String target) {

        int occurrence = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(target)) {
                occurrence++;
            }
        }
        System.out.println("This word is founded in the list " + occurrence + " times");
    }

    private static List<Integer> toList(int[] numbers) {

        List<Integer> nums = new ArrayList<>();

        for (int number : numbers) {
            nums.add(number);
        }
        return nums;
    }

    private static void findUnique(List<Integer> numbers) {

        List<Integer> nums = new ArrayList<>();
        for (int number : numbers) {
            if (!nums.contains(number)) {
                nums.add(number);
            }
        }
        System.out.println(nums);
    }

    private static List<String> findUniqueWords(List<String> words) {

        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
       return uniqueWords;
    }

    private static void calcOccurrence(List<String> words) {

        for (String uniqueWord : findUniqueWords(words)) {

            int count = 0;
            for (String word : words) {
                if (uniqueWord.equals(word)) {
                    count++;
                }
            }
            System.out.println(uniqueWord + ": " + count);
        }
    }

    private static void findOccurrence(List<String> words) {

        List<String> structure = new ArrayList<>();

        for (String uniqueWord : findUniqueWords(words)) {

            int count = 0;
            for (String word : words) {
                if (uniqueWord.equals(word)) {
                    count++;

                }
            }
            structure.add("{name: \"" + uniqueWord + "\", occurrence: " + count + "}\n");
        }
        System.out.println(structure);
        }
}











