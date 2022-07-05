package arrays;
import java.util.*;
public class find_3_Max_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in;
        int a = -2,b = -1, c = 0;

        for (int i = 0;i<n; i++ )
        {
            in = sc.nextInt();

            if(in>c)
            {
                a = b;
                b = c;
                c = in;
            }
            else if(in<c && in>b)
            {
                a = b;
                b = in;
            }
            else if(in<c && in<b && in>a)
            {
                a = in;
            }
        }

        System.out.printf("Maximum value in given array are: \n max1: %d \n max2: %d \n max3: %d",c,b,a);
    }
}
