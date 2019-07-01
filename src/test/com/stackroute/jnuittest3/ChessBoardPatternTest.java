package com.stackroute.jnuittest3;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
   ChessBoardPattern chessBoardPattern=new ChessBoardPattern();

    @Before
    public void setUp() {


    }

    @After
    public void tearDown() {

         chessBoardPattern = null;

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

