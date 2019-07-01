/*Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.*/

package com.stackroute.jnuittest3;

public class UserDefinedException {
    public static void main(String[] args) {
        String myexception = "This method will show message of finally block";
        int mynum = 12;
        try {
            if (mynum != 12) {
                throw new MyException("THE NUMBER DID NOT MATCH");

            }
        } catch (MyException e) {
            System.out.println(e);
        } finally {
            System.out.println("executes irrespective of conditions");
            System.out.println("Finnaly:" + myexception);
        }
    }
}
class MyException extends Exception{
    public MyException(String msg)
    {
        super(msg);
    }

}
