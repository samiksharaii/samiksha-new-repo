import java.util.*;
public class Recursion4 {
    public static void printFactorial(int n, int factorial){
        if(n==1||n==0) {
            System.out.println(factorial);
            return;
        }
        factorial= factorial*n;
        printFactorial(n-1, factorial);
    }
 public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         printFactorial(n,1);
 }
}
