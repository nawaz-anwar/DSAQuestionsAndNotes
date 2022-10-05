package Array.LinearSearch;

public class noOfNoEvenNoDigits {
    public static void main(String[] args) {
        int[] arr = {18,124,9,1764,98,1};
        System.out.println(findNumber(arr));
    }

    private static int findNumber(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if (even(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int i) {
        int noOfDigits = digits(i);

        return noOfDigits%2==0;
    }

    private static int digits(int i) {
        int count = 0;
        while (i>0){
            count++;
            i=i/10;

        }
        return count;
    }
}
