package Array.ArrayQuestions;

import java.util.Arrays;

public class runningSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;

        for(int i=1; i<n; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
