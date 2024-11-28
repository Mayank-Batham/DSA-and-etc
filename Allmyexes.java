
import java.util.Scanner;
public class Allmyexes {
    public static void PALLI(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.print("Not a Pallindrome");
                return;
            }
        }
        System.out.print("Is a Pallindrome");
        return;
    }
    public static void main(String[] args){
        System.out.println("Enter a string");
        Scanner abc = new Scanner(System.in);
        String s = abc.nextLine();
        PALLI(s);
    } 
    }