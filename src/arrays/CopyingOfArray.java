/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author prana
 */
public class CopyingOfArray {
    public static void main(String args[])
    {
        int S[]={1,2,3,4,32,43,3,2,42};
        int B[]=new int[10];
        
//         int B[]=Arrays.copyOf(S,S.length);



//        System.arraycopy(S,0,B,0,S.length);
        for(int i=0;i<B.length;i++)
        {
//           B[i]=S[i];
                   System.out.print(B[i]+",");

        }
    }
    
}
