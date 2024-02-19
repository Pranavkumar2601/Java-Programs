/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author prana
 */
public class Adding2MAtrices {
    public static void main(String args[])
    {
                int B[][]={{1,23,34,3},{32,53,54,23},{34,34,12,23}};
                int A[][]={{1,23,34,3},{32,53,54,23},{34,34,12,23}};
                int C[][]=new int[3][4];
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                         C[i][j]=A[i][j] + B[i][j];
                       System.out.print(C[i][j] +" ");        
                    }
                    System.out.println();
                }


    }
    
}
