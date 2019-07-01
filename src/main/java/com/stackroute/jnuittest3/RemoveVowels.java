/*Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia
Output:
Place Name without Vowels:0 Ind
Place Name without Vowels:1 Untd Stts

Place Name without Vowels:2 Grmny
Place Name without Vowels:3 Egypt
Place Name without Vowels:4 czchslvk*/

package com.stackroute.jnuittest3;
public class RemoveVowels {
    public String[] removevowels(String[] str)//initialized string
    {
        for(int i=0;i<str.length;i++)
        {
            str[i]=str[i].replaceAll("[aeiou]",""); //replaced all vowels with , and stored in string array
        }
        return str;// returning result
    }
}
