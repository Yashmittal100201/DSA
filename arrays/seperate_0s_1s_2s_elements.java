package arrays;
import java.util.*;
public class seperate_0s_1s_2s_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements in the array");

        int count[] = new int[3];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            count[arr[i]] = count[arr[i]] + 1;
        }

        int k = 0;
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<count[i];j++)
            {
                arr[k++] = i;
            }
        }


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
