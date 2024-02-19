/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author prana
 */
public class SecondLargestELement {
    public static void main(String args[])
    {
        int A[]={3,9,7,8,12,6,15,5,4};
        int max1=A[0];
        int max2=A[0];
        
//        for (int i=0;i<A.length;i++)
//        {
//            if(A[i] > max1)
//            {
//                max2=max1;
//                max1=A[i];   
//            }
//            else
//                if(A[i]>max2)
//                {
//                    max2=A[i];
//                }
//        }
//        System.out.println(max2);
    //for each loop
    for (int x:A)
    {if(x>max1)
    {
        max2=max1;
        max1=x;
    }
    else
    {
        if(x>max2)
        {
            max2=x;
        }
    }
        }
        System.out.println(max2);

    } 
}
