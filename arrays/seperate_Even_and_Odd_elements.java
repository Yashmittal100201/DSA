package arrays;
import java.util.*;
public class seperate_Even_and_Odd_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int i = 0,j = n-1;
        while(i<=j)
        {
            if(arr[i]%2!=0 && arr[j]%2==0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[i]%2==0)
            {
                i++;
            }
            if(arr[j]%2!=0)
            {
                j--;
            }

        }
        Arrays.sort(arr,0,i);
        Arrays.sort(arr,j+1,n);

        for(i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
