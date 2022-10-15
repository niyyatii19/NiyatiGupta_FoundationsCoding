import java.util.*;
public class Palindrome{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string input: ");
        String input = scan.next();
        System.out.println("Is Pallindrome: "+ 
                            isPallindrome(input, 0, input.length()-1));
        
     }
     
     private static boolean isPallindrome(String input, 
                                        int left, int right){
            if(left >= right) return true;
            if(input.charAt(left) != input.charAt(right)) return false;
            return isPallindrome(input, left+1, right-1);
        }
}