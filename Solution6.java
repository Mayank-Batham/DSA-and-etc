import java.util.*;
public class Solution6 {
    public static void countBits(int n) {
        int ray[] = new int[n+1];
        int k = 0;
        for (int j = 0;j<=n;j++){
        for (int i = 0;i<=(Math.log(j)/Math.log(2))+1;i++){
            if((1<<i & j)>0){
                k++;
                ray[j]=k;
            }
        }
        k=0;
    }
    for (int i = 0;i<=n;i++){
     System.out.println(ray[i]);}
    } 
    
    public static void main(String[] args) {
        System.out.print("Enetr array size:");
        Scanner abc = new Scanner(System.in);
        int n = abc.nextInt();
        countBits(n);
    }

    }