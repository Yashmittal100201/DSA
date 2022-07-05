package arrays;
import java.util.*;
public class simple_zigzg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i<n ;i++ )
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0,j = 1;
        while(j<n)
        {
            arr[i] += arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

            i+=2;
            j+=2;
        }
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
}
