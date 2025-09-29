package sep;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0, upper = 99;

        List<String> result = findMissingRanges(nums, lower, upper);
        System.out.println("Missing Ranges: " + result);
    }

    // Corrected order of parameters: lower first, then upper
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        int prev = lower - 1;

        for (int i = 0; i <= nums.length; i++) {
            int curr = (i < nums.length) ? nums[i] : upper + 1;

            if (curr - prev >= 2) {
                res.add(formatRanges(prev + 1, curr - 1));
            }
            prev = curr;
        }
        return res;
    }

    public static String formatRanges(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end; // fixed formatting
        }
    }
}

//Missing Ranges: [2, 4->49, 51->74, 76->99]

