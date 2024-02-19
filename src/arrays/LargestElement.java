/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author prana
 */
public class LargestElement {
     public static void main(String args[])
    {
        int A[]={3,9,7,8,12,6,15,5,4};
        int max=A[0];
//        for(int i=0;i<A.length;i++)
//        {
//            if(A[i]> max)
//            {
//                max=A[i];
//            }
//        }
//          System.out.println(max);

                                                                                                        //for earch loop
          
          for (int x:A)
          {
              if(x>max)
              {
                  max=x;
              }
          }
          System.out.println(max);
    }
}
