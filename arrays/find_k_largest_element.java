package arrays;
import java.util.*;
public class find_k_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = n-k;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
