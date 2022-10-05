package Array.LinearSearch;

public class linearByIndex {

    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        System.out.println(linaerSearch1(arr,target,1,6));
    }
    public static int linaerSearch1(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
        for (int i = start; i<=end; i++){
            if (arr[i]==target){
                return target;
            }
        }
        return -1;

    }


}
