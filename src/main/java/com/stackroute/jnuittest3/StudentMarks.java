/*Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.*/


package com.stackroute.jnuittest3;


public class StudentMarks {
    public String studentgrades(int numOfStudents, int stuGrades[])
    {
        int i;
        if (numOfStudents < 0)
        {
            return "invalid number of students";
        }
        for (i = 0; i < numOfStudents; i++)
        {
            if ((stuGrades[i] < 0) || (stuGrades[i] > 100))
            {
                return "invalid grades";
            }
        }
            if (i == numOfStudents)
            {
                return "Between 0 to 100";
            }
            return String.valueOf(0);
        }
}


