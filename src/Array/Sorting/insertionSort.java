package Array.Sorting;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
        System.out.println(Arrays.toString(bubbleSorting(nums)));
    }

    private static int[] bubbleSorting(int[] nums) {

        int count;
        for(int i=0; i<nums.length; i++)
        {
            int curr=nums[i];
            int prev=i-1;
            while (prev>=0 && nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;
        }

        return nums;

    }
}
