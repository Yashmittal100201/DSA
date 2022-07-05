package arrays;
import java.util.*;
public class print_element_that_have_At_least_k_greater_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of elements in array: ");
        int n = sc.nextInt();
        System.out.println("Enter at-least greater elements in array: ");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements of array: ");

        for (int i = 0;i<n; i++ )
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int i = 0;

        for(int ele: arr)
        {

            System.out.println(ele);
            i++;
            if(i==n-k)
            {
                break;
            }
        }
    }
}
