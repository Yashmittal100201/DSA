package arrays;
import java.util.*;
public class rearrange_Positive_Integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i, min, max;
        System.out.println("Enter the elements in the array");

        //   First way to solve this........
//        Integer maxArr[] = new Integer[n];
//        Integer minArr[] = new Integer[n];
//        for(i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//            maxArr[i] = arr[i];
//            minArr[i] = arr[i];
//        }
//        Arrays.sort(maxArr,Collections.reverseOrder());
//
//        int min = 0,max = 0;
//        for(i=0;i<n;i++)
//        {
//            if((i+1)%2!=0)
//            {
//                arr[i] = maxArr[max++];
//            }
//            else{
//                arr[i] = minArr[min++];
//            }
//        }
         //  Second way to solve this.....
        int minArr[] = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            minArr[i] = arr[i];
        }

        i = 0;
        min = 0;
        max = n-1;
        while(i<n)
        {
            if((i+1)%2!=0)
            {
                arr[i++] = minArr[max--];
            }
            else{
                arr[i++] = minArr[min++];
            }
        }

        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
