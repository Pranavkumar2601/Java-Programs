/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author prana
 */
public class RotaionOfArray {
    public static void main(String args[])
    {
        int A[]={1,24,4,52,4,3,43,2,42,43,25,242,44};
        int temp=A[0];
        for(int x:A)
        {
            System.out.print(x+",");
        }
        System.out.println();
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
          
        }
        A[A.length-1]=temp;
        for(int x:A)
        {
            System.out.print(x+",");
        }
    }
    
}
