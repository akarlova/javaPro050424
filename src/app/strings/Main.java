package app.strings;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        chooseOption();

    }

    private static void findSymbolOccurrence(String text, char symbol) {

        int occurance = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                occurance++;
            }
        }
        System.out.println("The occurrence of " + symbol + " is: " +
                occurance + " times");
    }

    private static void findWordPosition(String source, String target) {

        int position = source.indexOf(target);

        if (position >= 0) {
            System.out.println("Position of the first element of substring is " + position);
        } else {
            System.out.println("This string doesn't contain that substring. " +
                    "Position of the first element of substring is " + position);
        }
    }

    private static String stringReverse(String text) {

        char[] letters = text.toCharArray();
        char[] reversed = new char[text.length()];
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[text.length() - i - 1] = letters[i];
        }
        return new String(reversed);

    }

    private static void isPalindrome(String text) {

        String handledText = text.replace(" ", "");

        boolean isPalindrome = handledText.equalsIgnoreCase(stringReverse(handledText));
        System.out.println(isPalindrome);
    }

    private static void playGame() {

        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        int indexOfword = random.nextInt(words.length);
        String wordToGuess = words[indexOfword];

        boolean wordIsGuessed = false;

        Scanner playStart = new Scanner(System.in);

        System.out.println("Let's start game ");


        while (!wordIsGuessed) {

            System.out.println("Please, guess the word: ");
            String userAnswer = playStart.nextLine().toLowerCase().trim();

            if (userAnswer.equals(wordToGuess)) {
                System.out.println("You guessed the word!");
                wordIsGuessed = true;
            } else {
                String guessedLetters = "";
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (i < userAnswer.length() &&
                            userAnswer.charAt(i) == wordToGuess.charAt(i)) {
                        guessedLetters += wordToGuess.charAt(i);
                    } else {
                        guessedLetters += "#";
                    }
                }
                System.out.println("Please, try again. You have guessed next letters: "
                        + guessedLetters + "#".repeat((15 - wordToGuess.length())));
            }

        }
        playStart.close();
    }

    private static void chooseOption() {
        Scanner scan = new Scanner(System.in);

        System.out.println(""" 
                Please choose one of the following options:
                1 - find symbol occurrence in the text;
                2 - find word position in the text;
                3 - reverse the text;
                4 - know if the text is a palindrome;
                5 - play the game "Guess a word";
                """
        );
        String option = scan.nextLine().trim();
        int choice = Integer.parseInt(option);
        switch (choice) {
            case 1:
                System.out.println("Enter the word ");
                String word = scan.nextLine().trim();
                System.out.println("Enter a symbol");
                char symbol = scan.nextLine().charAt(0);
                findSymbolOccurrence(word, symbol);
                break;
            case 2:
                System.out.println("Enter the string ");
                String text = scan.nextLine().trim();
                System.out.println("Enter the target ");
                String target = scan.nextLine().trim();
                findWordPosition(text, target);
                break;
            case 3:
                System.out.println("Enter the string");
                String userString = scan.nextLine().trim();
                stringReverse(userString);
                break;
            case 4:
                System.out.println("Enter the text");
                String palindrome = scan.nextLine().trim();
                isPalindrome(palindrome);
                break;
            case 5:
                playGame();
                break;
            default:
                System.out.println("Invalid option. Try again");
                chooseOption();
        }
    }
}






