import java.util.*;
class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return indices;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner abc = new Scanner(System.in);
        int size = abc.nextInt();
        System.out.println("Enter array elements");
        int[] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i] = abc.nextInt();
        }
        System.out.print("Enter target");
        int target = abc.nextInt();
        System.out.print(twoSum(nums,target));
    }
}