package Array.Sorting;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
        System.out.println(Arrays.toString(bubbleSorting(nums)));
    }

    private static int[] bubbleSorting(int[] nums) {

        int count;
        for(int i=0; i<nums.length-1; i++)
        {
            int minPos=i;
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[minPos] < nums[j])
                {
                    minPos=j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
        return nums;

    }
}
