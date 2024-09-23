
import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("How large would you like the triangle to be: ");
        int size = in.nextInt();


        Print(size);
        in.close();
}

public static int combination(int n, int r){
    return factorial(n)/(factorial(r)*factorial(n-r));
}

public static int factorial(int n){
    int s = 1; 
    for (int i = 1 ; i <= n; i++){
        s *= i;

    }
    return s;
}

public static int Pascal(int n, int m){

    return combination(n, m);
}

public static void Print(int n){
    for (int i = 0; i < n; i++) {
        // Print leading spaces to center the triangle
        for (int j = n - i; j > 1; j--) {
            System.out.print(" ");
        }

        // Print Pascal's Triangle numbers for the current row
        for (int j = 0; j <= i; j++) {
            System.out.print(Pascal(i, j) + " ");  // Add a space after each number
        }

        // Move to the next line
        System.out.println();
    }
} 

}