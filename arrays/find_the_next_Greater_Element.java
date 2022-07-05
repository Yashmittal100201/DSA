package arrays;
import java.util.*;
public class find_the_next_Greater_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0;i<n ;i++ )
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<n ;i++ )
        {
            int ele = -1;
            for(int j = i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    ele = arr[j];
                    break;
                }
            }
            if(ele>-1)
            {
                map.put(arr[i],ele);
            }
        }
        for(Integer ele: map.keySet())
        {
            System.out.println(ele+": "+map.get(ele));
        }
    }
}
