package app.exceptions;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] incorrectSizeArray = {
                {"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
        };

        String[][] incorrectDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "pam", "8"},
                {"9", "10", "11", "12"},
                {"mew", "14", "15", "16"}
        };

        try {
            int result = ArrayValueCalculator.doCalc(correctArray);
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());

        }

        try {
            int result = ArrayValueCalculator.doCalc(incorrectSizeArray);
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());

        }

        try {
            int result = ArrayValueCalculator.doCalc(incorrectDataArray);
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());

        }
    }
}
