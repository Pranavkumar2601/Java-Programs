/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author prana
 */
public class InsetingAnElement {
    public static void main(String args[])
    {
        int A[] = new int[10];
        A[0]=5;
        A[1]=65;
        A[2]=45;
        A[3]=25;
        A[4]=15;
        int index=3;
        int n=5;
        int x=11;
         for (int i=n;i>index;i--)
         {
             A[i]=A[i=1];
         }
         A[index]=x;
         for(int i:A)
         {
             System.out.println(i);
         }
    }
    
}
