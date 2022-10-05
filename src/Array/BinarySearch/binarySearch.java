package Array.BinarySearch;

public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {18,124,9,1764,98,1};
        int target = 98;
        System.out.println(search(arr,target));
    }

    private static int search(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
