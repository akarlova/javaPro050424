package app.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Task_Second {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
