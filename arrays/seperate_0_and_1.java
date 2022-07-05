package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class seperate_0_and_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int i = 0,j = n-1;
        while(i<j)
        {
            if(arr[i]==1 && arr[j]==0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[i]==0)
            {
                i++;
            }
            if(arr[j]!=0)
            {
                j--;
            }

        }

        for(i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


