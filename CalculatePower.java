import java.util.*;
public class CalculatePower{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        System.out.println("Enter the power: ");
        int power = scan.nextInt();
        System.out.println(""+ n + "^"+power+" = "+ 
        calculatePower(n, power));
     }
     
     private static long calculatePower(int n, int x){
         long result;
         if(x == 0){
             return 1;
         }
         result = calculatePower(n, x/2);
         if(x % 2 == 0){
             return result * result;
         }
         
         return n * result * result;
         
     }
}