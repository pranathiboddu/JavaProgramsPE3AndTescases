package com.stackroute.jnuittest3;

import org.junit.*;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels = new RemoveVowels();

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");
        removeVowels = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");


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
