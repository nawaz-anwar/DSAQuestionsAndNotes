package Array.ArrayQuestions;

import java.util.Arrays;

public class concatenationOfArray {

    public static void main(String[] args) {
        int[] nums = {18,124,9,1764,98,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] nums1 = new int[n*2];

        for(int i=0; i<n; i++){
            nums1[i]=nums[i];
            nums1[i+n]=nums[i];
        }
        return nums1;
    }
}
