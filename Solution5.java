import java.util.*;
public class Solution5 {
        public static  int largestAltitude(int[] gain) {
            int x=0, y=0, z=0;
            for (int i = 0; i<gain.length;i++){
                if (i>=1){
                    y = y + gain[i-1];
                }
                x = x + gain[i];
                if (x>y & x>z){
                    z = x;
                }   
            }
            return z;
        }
        public static void main(String[] args) {
            System.out.println("Enter size of array:");
            Scanner abc = new Scanner(System.in);
            int n = abc.nextInt();
            int gain[] = new int[n+1];
            System.out.println("Enter the values:");
            gain[0] = 0;
            for (int i=1;i<=n;i++){
                gain[i] = abc.nextInt();
            }
            System.out.print("Highest altitude is:");
            System.out.print(largestAltitude(gain));
        }
}
