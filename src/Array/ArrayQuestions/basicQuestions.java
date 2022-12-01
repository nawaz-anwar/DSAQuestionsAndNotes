package Array.ArrayQuestions;

public class basicQuestions {

    public static int linearSearch(int arr[], int k){
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==k) {
                return i+1;
            }
        }
        return -1;
    }

    public static void reverse(int arr[]){
        int j = arr.length-1;
        for (int i = 0; i < arr.length/2; i++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
        }
    }

    public static void maxAndMinValue(int arr[]){
        int maxValue = arr[0];
        int minValue = arr[0];

        for (int i = 0; i < arr.length-1; i++){
            for (int j = 1; j < arr.length; j++){
                if (arr[j]>maxValue){
                    maxValue = arr[j];
                }
                if (arr[j]<minValue){
                    minValue = arr[j];
                }
            }
        }

        System.out.println("Maximum Value:"+maxValue);
        System.out.println("Minimum Value:"+minValue);
    }

    public static void swapAdjacent(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void printPairs(int arr[]){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }

    public static void printSubArrays(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                System.out.print("{");
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k]+",");
                }
                System.out.print("} ");
            }
            System.out.println();
        }
    }

    public static int kadenes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++){
            cs+=arr[i];
            if (cs<0){
                cs = 0;
            }

            ms = Math.max(cs,ms);
        }

        return ms;
    }

    public static void traverse(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        int k = 21;
        //linear Search
        System.out.println(linearSearch(arr,k));

        //reverse(arr);
        traverse(arr);
        System.out.println();
        maxAndMinValue(arr);

        //swapAdjacent(arr);
        //traverse(arr);

        System.out.println();
        printPairs(arr);

        System.out.println();
        printSubArrays(arr);

        System.out.println();
        System.out.println(kadenes(arr));

    }

}
