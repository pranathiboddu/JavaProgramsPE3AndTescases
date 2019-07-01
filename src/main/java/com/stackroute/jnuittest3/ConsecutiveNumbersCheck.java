/*Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a string and use split()
Input: 98,96,95,94,93
Output: 98,96,95,94,93 non consecutive numbers
Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers
Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers */

package com.stackroute.jnuittest3;

import static java.lang.Integer.valueOf;

public class ConsecutiveNumbersCheck {
    public String consecutivecheck(String number)
    {
        String[] array=number.split(",");
        int diff;
        boolean flag=true;
        for(int i=0;i<array.length-1;i++)
        {
            diff = valueOf(array[i])-valueOf(array[i+1]);
            if(Math.abs(diff)!=1)
            {
               flag=false;
                break;
            }
        }

        if(flag)
            return ("The numbers are consecutive");
        else
            return ("The numbers are not consecutive");
    }

    }

