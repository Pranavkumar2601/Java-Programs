
package arrays;

/**
 *
 * @author prana
 */
public class SumOfAllElements {
    public static void main(String args[])
    {
        int A[]={2,4,5,2,4,2,3};
        int sum=0;
//        for(int i=0;i<A.length;i++)
//        {
//            sum=sum+A[i];
//        }
//         System.out.println(sum);
         
         for(int x:A)
         {
             sum=sum+x;
         }
         System.out.print(sum);
    }
           
    
}
