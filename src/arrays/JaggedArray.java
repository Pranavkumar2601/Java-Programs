/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;


public class JaggedArray {
    @SuppressWarnings("empty-statement")
    public static void main(String args[])
    {
        int a[][]=new int[3][];
        a[0]=new int[4];

        a[1]=new int[2];
        a[2]=new int[10];
        
        for(int x[]:a)
        {
            for(int y:x)
            {
                System.out.print(y);
            }
            System.out.println();
        }

    }
    
}
