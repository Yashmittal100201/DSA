package arrays;
import java.util.*;
public class find_Second_Smallest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min1 = Integer.MAX_VALUE;
        int min2 = min1+1;
        int in;
        for(int i = 0;i<n;i++)
        {
            in = sc.nextInt();
            if(in<min1)
            {
                min2 = min1;
                min1 = in;
            }
            else if(in>min1 && in<min2)
            {
                min2 = in;
            }
        }

        System.out.println("min2:"+min2+"\nmin1: "+min1);
    }
}
