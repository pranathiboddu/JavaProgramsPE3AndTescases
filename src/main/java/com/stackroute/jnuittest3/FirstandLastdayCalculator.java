package com.stackroute.jnuittest3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstandLastdayCalculator {


    public void weekdate()
    {
        Calendar c = Calendar.getInstance(); //getting date from system
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); //setting monday as first day of week
        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy HH/mm/sss");
        System.out.println("First Date of the week: " + df.format(c.getTime())); //printing first day

        c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY); //setting sunday as last day of week
        System.out.println("Last Date of the week: " + df.format(c.getTime())); //printing last day
        System.out.println();
    }
    public static void main(String []args)
    {
       FirstandLastdayCalculator obj= new FirstandLastdayCalculator();
        obj.weekdate();
    }

}
