package com.stackroute.jnuittest3;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks = new StudentMarks();

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");
        studentMarks = null;

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
    public void givenStudentsShouldReturnInvalidStudents() {
        //arrange
        StudentMarks studentMarks = new StudentMarks();
        //Act
        String result = studentMarks.studentgrades(-3,new int[] {78,89,90});
        //Assert
        assertEquals("invalid number of students", result);
    }
    @Test
    public void givenGradesShouldReturnGardesTrue() {
        //arrange
        StudentMarks studentMarks = new StudentMarks();
        //Act
        String result = studentMarks.studentgrades(4,new int[] {78,89,90,76});
        //Assert
        assertEquals("Between 0 to 100", result);
    }
    @Test
    public void givenGradesshouldReturnInvalidGardes() {
        //arrange
        StudentMarks studentMarks = new StudentMarks();
        //Act
        String result = studentMarks.studentgrades(4,new int[] {18,-9,90,176});
        //Assert
        assertEquals("invalid grades", result);
    }

}