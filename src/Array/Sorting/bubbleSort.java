package Array.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
        System.out.println(Arrays.toString(bubbleSorting(nums)));
    }

    private static int[] bubbleSorting(int[] nums) {

        int count;
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=0; j<nums.length-1-i; j++)
            {
                if(nums[j] < nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;

    }

}
