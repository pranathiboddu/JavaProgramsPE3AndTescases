package com.stackroute.jnuittest3;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
   ChessBoardPattern chessBoardPattern=new ChessBoardPattern();

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");
         chessBoardPattern = null;

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
        public void givenInputShouldReturnChessBoardPattern() {
            String res=chessBoardPattern.chessboardpattern();
            assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                    "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                    "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                    "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n",res);

        }
    }

