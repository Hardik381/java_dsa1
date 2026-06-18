/*
 * patterns.java
 * Topic: Console patterns (printing shapes)
 * Concepts: nested loops, spaces, character printing, pattern generation
 * How to run: javac patterns.java && java patterns
 * Notes: Examples include triangles, diamonds, Floyd's triangle, hollow shapes,
 * and butterfly patterns useful for practicing nested loops.
 */
public class patterns{
    public static void main(String[] args){
        int n=5;

        // printing the left to right triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //printing the right angle triangle

        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //printing half diamond

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //prints floyd triangle

        int k=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

        //print filled Diamond pattern

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //print half filled diamond pattern

        for(int i=1;i<n+1;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n;i>1;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }

        //printing the hollow rectangle

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 ||j==n){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        //printing butterfly pattern

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}