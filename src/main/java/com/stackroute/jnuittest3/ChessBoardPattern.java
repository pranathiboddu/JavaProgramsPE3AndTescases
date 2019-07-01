/*Write a program to create a ChessBoard pattern with the help of multidimensional array, where
        WWrepresents white color and BB represents Black color.
        Output:
        My Chess Board
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW| */

package com.stackroute.jnuittest3;

public class ChessBoardPattern {
    public String chessboardpattern()
    {
        String[][] outp=new String[8][8];
        String output="";
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if((i+j)%2==0)
                {
                    outp[i][j]="WW|";
                }
                else
                {
                    outp[i][j]="BB|";
                }
            }
        }
        System.out.println("---------CHESS BOARD-----------");
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(outp[i][j]);
                output=output+outp[i][j];
            }
            System.out.println();
            output=output+"\n";
        }

        return output;
    }
}

