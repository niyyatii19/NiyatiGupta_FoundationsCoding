
import java.util.*;
public class TwoSum{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scan.nextInt();
        System.out.println("Enter the array in sorted order: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = scan.nextInt();
        System.out.println("Output: "+ 
                    Arrays.toString(twoSum(arr, target)));
        
     }
     
     private static int[] twoSum(int[] arr, int target){
            int left =0;
            int right = arr.length-1;
            int[] result = new int[2];
            
            while(left <= right){
                int sum = arr[left] + arr[right];
                
                if(sum == target){
                    result[0] = left;
                    result[1] = right;
                    break;
                }
                
                if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
            
            return result;
            
        }
}