//     To print like this patter   

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 



public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    for(int i=1; i < 2 * n; i++)
	    {
	        int c = i <= n ? i : 2*n - i;                    
	        int space = n-c;
	        
	        for(int k=1;k<=space;k++ )                       //    print spaces
	        {
	            System.out.print(" ");
	        }
	        
	        for(int j = 1; j <= c; j++)
	        {
	            
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
