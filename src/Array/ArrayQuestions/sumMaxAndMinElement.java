package Array.ArrayQuestions;

public class sumMaxAndMinElement {
    public static void main(String[] args) {
        int[] A = {2,5,1,3,4,7};
        int N = 3;
        System.out.println(findSum(A,N));
    }

    public static int findSum(int A[],int N)
    {
        int max=0;
        int min=0;
        for(int i=0; i<A.length; i++){

            if (A[i]>max){
                max=A[i];
            }
            if (A[i]<min){
                min=A[i];
            }
        }
        return max+min;
    }
}
