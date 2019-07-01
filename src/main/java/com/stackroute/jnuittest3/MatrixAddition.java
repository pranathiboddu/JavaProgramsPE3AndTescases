/*Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix
Output:
Input number of rows of matrix: 3
Input number of columns of matrix: 2
Input elements of first matrix: 1 2 3 4 5 6
Input the elements of second matrix: 9 8 7 6 5 4
Sum of the matrices:-
10 10
10 10
10 10  */
package com.stackroute.jnuittest3;

public class MatrixAddition {
    public int[][] matrixaddition(int rows,int columns,int[][] first,int[][] second)//initialized the rows,columns,matrix1 and matrix2
    {
        int[][] result=new int[rows][columns];
        for (int i= 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = first[i][j] + second[i][j]; //storing the sum of matrix1 and matrix into result array
            }
        }
       return result ;
    }
}
