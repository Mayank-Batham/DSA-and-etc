import java.util.*;
class Solution4 {
    public static void mergeAlternately(String word1, String word2){
        System.out.print("word1:  ");
        for(int i=0;i<word1.length();i++){
            System.out.print(word1.charAt(i)+"   ");
        }
        for(int i=1+word1.length();i<=word2.length();i++){
            System.out.print("    ");
        }

        System.out.println(" ");
        System.out.print("word2:    ");
        for(int i=0;i<word2.length();i++){
            System.out.print(word2.charAt(i)+"   ");
        }
        for(int i=1+word2.length();i<=word1.length();i++){
            System.out.print("    ");
        }
        System.out.println(" ");
        System.out.print("merged:");
        for (int i=1;i<=word1.length() | i<=word2.length();i++){
            if(i<=word1.length()){    
            System.out.print(" "+word1.charAt(i-1));
                }else {System.out.print("  ");}
                if(i<=word2.length()){    
                    System.out.print(" "+word2.charAt(i-1));
                        }else {System.out.print("  ");}
            }
            }
public static void main(String[] args) {
    System.out.println("Enter word1:");
    Scanner abc = new Scanner(System.in);
    String word1 = abc.next();
    System.out.println("Enter word2:");
    String word2 = abc.next();
    mergeAlternately(word1,word2);
    abc.close();
}
    }
