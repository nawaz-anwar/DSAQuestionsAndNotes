package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class containsDuplicate {

    public static void main(String[] args) {
        int[] A = {1,2,3,1};
        System.out.println(containsDuplicate(A));
    }

    public static boolean containsDuplicate(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                    return true;
                }
            }
        }


        return false;
    }
}
