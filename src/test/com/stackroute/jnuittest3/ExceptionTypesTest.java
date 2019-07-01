package com.stackroute.jnuittest3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTypesTest {

    ExceptionTypes exceptionTypes=new ExceptionTypes();
    @Test
    public void testForMultipleCatchSuccess()
    {
        assertEquals("Null pointer Exception", exceptionTypes.handlingMultipleCatch(null));

        assertEquals("Index out of bound exception", exceptionTypes.handlingMultipleCatch("Pr@na"));

        assertEquals("Negative Array Size Exception", exceptionTypes.handlingMultipleCatch("demo"));

        assertEquals(null, exceptionTypes.handlingMultipleCatch("stackroute"));

    }

    @Test
    public void testForMultipleCatchFailure()
    {
        assertEquals(null, exceptionTypes.handlingMultipleCatch("stackroute"));

    }

}

