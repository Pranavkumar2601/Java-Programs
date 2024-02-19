/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author prana
 */
public class IncreasingSizeOfArray {
    public static void main(String args[])
    {
        int A[]={1,4,42,43};
        int B[]=new int[2*A.length];
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;
       
           System.out.println(A.length);
       
    }
    
}
