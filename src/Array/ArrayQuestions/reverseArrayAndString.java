package Array.ArrayQuestions;

import java.util.Arrays;

public class reverseArrayAndString {

    public static void main(String[] args) {
        int[] A = {2,5,1,3,4,7};
        reverseArray(A);
    }

    //private static void reverseArray(int[] A) {
    private static void reverseArray(int[] A) {
        for (int i=A.length-1; i>=0; i--){
            System.out.print(A[i]+" ");
        }
    }
}
