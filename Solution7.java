
import java.util.*;

public class Solution7 {
    public static void  tribonacci(int n){
        int a=0,b=1,c=1,e=0;
        switch (n){
            case 0: System.out.print(a);
            return;
            case 1: System.out.print(b);
            return;
            case 2: System.out.print(c);
            return;
        }
        for (int i = 2;i<n;i++){
            e=a+b+c;
            a=b;
            b=c;
            c=e;
        }
        System.out.println(e);
        return;
   }
   public static void main(String[] args) {
       System.out.println("Enter the n-th number you want to find");
       Scanner abc = new Scanner(System.in);
       int n = abc.nextInt();
       tribonacci(n);
   }
}




