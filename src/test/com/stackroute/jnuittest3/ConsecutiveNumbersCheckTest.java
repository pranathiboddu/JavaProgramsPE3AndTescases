package com.stackroute.jnuittest3;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveNumbersCheckTest {
   ConsecutiveNumbersCheck consecutiveNumbersCheck=new ConsecutiveNumbersCheck();

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");
        consecutiveNumbersCheck = null;

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
    public void givenStringShouldReturnConsecutiveNumbers() {
        //arrange
        ConsecutiveNumbersCheck consecutiveNumbersCheck=new ConsecutiveNumbersCheck();
        //Act
        String result = consecutiveNumbersCheck.consecutivecheck("15,16,17");
        //Assert
        String expectedValue = "The numbers are consecutive";
        assertEquals(expectedValue,result);
    }
    @Test
    public void givenStringShouldReturnNotaConsecutiveNumbers() {
        //arrange
        ConsecutiveNumbersCheck consecutiveNumbersCheck=new ConsecutiveNumbersCheck();
        //Act
        String result = consecutiveNumbersCheck.consecutivecheck("15,19,25");
        //Assert
        String expectedValue = "The numbers are not consecutive";
        assertEquals(expectedValue,result);
    }
    @Test
    public void givenStringShouldReturnConsecutiveNumbersfornegativeValues() {
        //arrange
        ConsecutiveNumbersCheck consecutiveNumbersCheck=new ConsecutiveNumbersCheck();
        //Act
        String result = consecutiveNumbersCheck.consecutivecheck("-1,-2,-3");
        //Assert
        String expectedValue = "The numbers are consecutive";
        assertEquals(expectedValue,result);
    }
    @Test
    public void givenStringShouldReturnNotConsecutiveNumbersfornegativeValues() {
        //arrange
        ConsecutiveNumbersCheck consecutiveNumbersCheck=new ConsecutiveNumbersCheck();
        //Act
        String result = consecutiveNumbersCheck.consecutivecheck("-1,-6,-11");
        //Assert
        String expectedValue = "The numbers are consecutive";
        assertNotEquals(expectedValue,result);
    }


}