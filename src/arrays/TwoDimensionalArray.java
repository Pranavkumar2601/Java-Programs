
package arrays;

/**
 *
 * @author prana
 */
public class TwoDimensionalArray {
    public static void main(String args[])
    {
        int A[][]=new int[3][4];
        int B[][]={{1,23,34,3},{32,53,54,23},{34,34,12,23}};
        
       for(int i=0;i<A.length;i++)
       {
           for (int j=0;j<A[i].length;j++)
           {
               System.out.print(A[i][j]);
           }
          System.out.println("");
       }
       
       for(int x[]:B)
       {
           for(int y:x)
           {
               System.out.print(y);
           }
           System.out.println("");
       }
    }
    
}
