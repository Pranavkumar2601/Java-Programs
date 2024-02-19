/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author prana
 */
public class SearchAnElement {
    public static void main(String args[])
    {
        int A[]={3,9,7,8,12,6,15,5,4};
        int key=15;
//        for(int x:A) //By foreach loop
//        {
//            if(x==key)
//            {
//                System.out.println("Element Found");
////                System.exit(0);
//            }
//        }
//        System.out.println("Element not found");
        
        //By for loop
        for (int i=0;i<A.length;i++)
         { 
            if(A[i]==key)
            {
                System.out.println("Element Found"+ A[i]);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
    }
    
}
