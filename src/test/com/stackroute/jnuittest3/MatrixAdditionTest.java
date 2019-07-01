
package com.stackroute.jnuittest3;

import org.junit.*;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition = new MatrixAddition();

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {

        matrixAddition = null;
    }

    @Test
    public void givenMatricesShouldReturnAdditionOfMatrices() {
        //arrange
        MatrixAddition matrixAddition = new MatrixAddition();
        //Act
        int[][] result = matrixAddition.matrixaddition(3, 3,new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}});
        //Assert
        int[][] expectedValue = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
       assertEquals(expectedValue,result);
    }
    @Test
    public void givenMatricesWithDifferentRowsAndColumnsShouldReturnAdditionOfMatrices() {
        //arrange
        MatrixAddition matrixAddition = new MatrixAddition();
        //Act
        int[][] result = matrixAddition.matrixaddition(3, 2,new int[][] {{2, 2}, {4, 4}, {6, 6}}, new int[][]{{10, 9}, {6,5}, {8, 7}});
        //Assert
        int[][] expectedValue = {{12, 11},{10, 9}, {14, 13}};
        assertEquals(expectedValue,result);
    }
}
