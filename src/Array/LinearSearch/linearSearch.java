package Array.LinearSearch;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        System.out.println(linaerSearch3(arr,target));
    }
    /*
    public static int linaerSearch1(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==target){
                return target;
            }
        }
        return -1;

    }


    public static boolean linaerSearch2(int[] arr, int target){
        if (arr.length==0){
            return false;
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==target){
                return true;
            }
        }
        return false;

    }

     */

    public static int linaerSearch3(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;

    }
}
