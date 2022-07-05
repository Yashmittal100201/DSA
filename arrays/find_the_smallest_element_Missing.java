package arrays;
import java.util.*;
public class find_the_smallest_element_Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i<n ;i++ )
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 1;
        while(i<n)
        {
            if((arr[i]-arr[i-1])>1)
            {
                System.out.println(arr[i]-1);
                break;
            }
            i++;
        }
    }
}
