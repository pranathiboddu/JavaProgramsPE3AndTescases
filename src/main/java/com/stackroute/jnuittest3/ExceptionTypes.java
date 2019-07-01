/*Write a program that will generate exceptions of type NegativeArraySizeException,
 IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.*/

package com.stackroute.jnuittest3;

import java.util.Scanner;

public class ExceptionTypes {

    public ExceptionTypes()
    {

    }

    public String handlingMultipleCatch(String input)
    {
        try{

            int index = input.indexOf('a');

            int array[] = new int[index];

            for(int i=0; i < index ; i++)
            {
                if(input.contains("@"))
                {
                    array[index] = array[index+index];
                }
            }

            return null;

        }
        catch (NullPointerException nullpointerException)
        {
            return "Null pointer Exception";
        }
        catch (IndexOutOfBoundsException indexOutOfBoundException)
        {
            return "Index out of bound exception";
        }
        catch (NegativeArraySizeException negativeArraySizeException)
        {
            return "Negative Array Size Exception";
        }
    }
}



