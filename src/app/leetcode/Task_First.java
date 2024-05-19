package app.leetcode;

public class Task_First {
    public static void main(String[] args) {

        System.out.println(isPalindromeString("0P"));

    }

    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}
