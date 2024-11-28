import java.util.*;
public class Armstrong {
    static void ARMSTRONG(int n){
        int sum = 0,x,y=n;
        for(int i=0;i<100;i++){
            x=y%10;
            sum += x*x*x;
            y=(int)Math.floor(y/10);
            System.out.println(y);
            if(y==0){break;}
        }
        if (n==sum){
            System.out.print("Is an armstrong number");
        }else{
            System.out.print("Not armstrong number");
        }
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number");
        Scanner abc = new Scanner(System.in);
        int n = abc.nextInt();
        ARMSTRONG(n);
    }
}
