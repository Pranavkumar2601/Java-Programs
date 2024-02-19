
package arrays;

/**
 *
 * @author prana
 */
public class Multiplying2Matrices {
    public static void main(String args[])
    {
          int B[][]={{1,23,34},{3,5,5},{3,3,3}};
           int A[][]={{1,0,0},{0,1,0},{0,0,1}};
          int C[][]=new int[3][3];
          
          for(int i=0;i<3;i++)
          {
              for(int j=0;j<3;j++)
              {
                  C[i][j]=0;
                  for(int k=0;k<3;k++)
                      
                  {
                      C[i][j]=C[i][j]+A[i][k] *B[k][j];
//                      System.out.print(C[i][j] + " ");
                  }
//                  System.out.println("");
              }
          }
          for(int x[]:C)
          {
              for(int y:x)
              {
                  System.out.print(y + " ");
              }
                System.out.println("");
          }
    }    
}
