package arrays;
import java.util.*;
class update_every_Array_element_by_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (int i = 0;i<n ;i++ )
        {
            arr[i] = sc.nextInt();
        }
        arr1[0] = arr[0] * arr[1];
        for (int i = 1;i<n-1 ;i++ )
        {
            arr1[i] = arr[i-1]*arr[i+1];

        }
        arr1[n-1] = arr[n-2]*arr[n-1];

        for(int i = 0;i<n;i++)
            System.out.print(arr1[i]+" ");
    }
}
