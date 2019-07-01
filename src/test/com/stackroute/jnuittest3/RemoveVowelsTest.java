package com.stackroute.jnuittest3;

import org.junit.*;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels = new RemoveVowels();

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        removeVowels = null;

    }

    @Test
    public void givenStringsShouldReturnstringArraywithOutVowels() {
        //arrange
        RemoveVowels removeVowels = new RemoveVowels();
        //Act
        String[] str={"India","Australia"};
        String[] result = removeVowels.removevowels(str);
        String[] expectedValue = {"Ind", "Astrl"};
        //Assert
        assertArrayEquals(expectedValue, result);
    }
}
