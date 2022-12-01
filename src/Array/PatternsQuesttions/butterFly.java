package Array.PatternsQuesttions;

public class butterFly {
    public static void main(String[] args) {
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int a = 4;

        for (int i=1; i<=a; i++){

            if (i<a-i){
                System.out.println(" ");
            }
            if (i<a){
                System.out.println("*");
            }
            //System.out.println();

        }
    }
}
