
import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("How large would you like the triangle to be: ");
        int size = in.nextInt();
        int fact; 
        fact = combination(24, 12); 
        System.out.println(fact);
        in.close();
}

public static int combination(int n, int r){
    int C = 0;
    C = factorial(n)/factorial(r)*factorial(n-r);
    return C;
}

public static int factorial(int n){
    int s = 1; 
    for (int i = 1 ; i <= n; i++){
        s *= i;

    }
    return s;
}

}