package Array.ArrayQuestions;

import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int target = 3;
        System.out.println(getConcatenation(nums,target));
    }

    public static int[] getConcatenation(int[] nums,int target) {
        int[] nums1 = new int[nums.length];
        for(int i=0; i<target; i++){
            nums1[i]=nums[i];
            nums1[i+1] = nums[target+1];
        }
        return nums1;
    }
}
