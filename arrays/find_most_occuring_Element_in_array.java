package arrays;
import java.util.*;
public class find_most_occuring_Element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        System.out.println("Enter Value of N: ");
        int n = sc.nextInt();
        int maxFre = 0;
        int maxEle = 0;
        System.out.println("Enter Array elements: ");

        for (int i = 0;i<n; i++ )
        {
            int in = sc.nextInt();

            if(i==0)
                maxEle = in;

            if(!map.containsKey(in))
            {
                map.put(in,1);
            }
            else{
                map.put(in,map.get(in)+1);
            }

            maxFre = Math.max(maxFre,map.get(in));

            if(map.get(maxEle) < maxFre) 
            {
                maxEle = in;
            }
        }
        if(maxFre == 1)
        {
            System.out.println("All have same Occurance..");
        }
        else{
            System.out.println(maxEle);
        }
    }
}
