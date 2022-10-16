
import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        System.out.println("Enter the array elements: ");
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(getTheLargestNumber(arr));
    }
   
    private static String getTheLargestNumber(Integer[] arr){
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                String n1 = Integer.toString(a);
                String n2 = Integer.toString(b);
                return (n2+n1).compareTo(n1+n2);
            }
        });
        String s = "";
        for(int i=0;i<arr.length; i++){
            s += arr[i];
        }
        return s;
    }
}