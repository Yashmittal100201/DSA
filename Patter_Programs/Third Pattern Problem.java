//    To print pattern like this

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
//    * * * *
//    * * *
//    * * 
//    *

//    Approach 1

public class Main
{
	public static void main(String[] args) {
	    int n = 9;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j = 1; j <= ( i <= (n+1)/2 ? i : n-i+1 ); j++)
	        {
	            
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}


//   Approach  2

public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    for(int i=1; i < 2*n; i++)
	    {
	        for(int j=1; j <= ( i <= n ? i : (2*n)-i ); j++)
	        {
	            
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
