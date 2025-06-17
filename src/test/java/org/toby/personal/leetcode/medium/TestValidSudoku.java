package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestValidSudoku {

    @Test
    void test_valid_sudoku_returns_true()
    {
        char[] firstLine = new char[9];
        firstLine[0] = '5';
        firstLine[1] = '3';
        firstLine[4] = '7';
        char[] secondLine = new char[9];
        secondLine[0] = '6';
        secondLine[3] = '1';
        secondLine[4] = '9';
        secondLine[5] = '5';
        char[] thirdLine = new char[9];
        thirdLine[1] = '9';
        thirdLine[2] = '8';
        thirdLine[7] = '6';
        char[] forthLine = new char[9];
        forthLine[0] = '8';
        forthLine[4] = '6';
        forthLine[8] = '3';
        char[] fifthLine = new char[9];
        fifthLine[0] = '4';
        fifthLine[3] = '8';
        fifthLine[5] = '3';
        fifthLine[8] = '1';
        char[] sixthLine = new char[9];
        sixthLine[0] = '7';
        sixthLine[4] = '2';
        sixthLine[8] = '6';
        char[] seventhLine = new char[9];
        seventhLine[1] = '6';
        seventhLine[6] = '2';
        seventhLine[7] = '8';
        char[] eighthLine = new char[9];
        eighthLine[3] = '4';
        eighthLine[4] = '1';
        eighthLine[5] = '9';
        eighthLine[8] = '5';
        char[] ninthLine = new char[9];
        ninthLine[4] = '8';
        ninthLine[7] = '7';
        ninthLine[8] = '9';

        char[][] sudoku = createSudoku(firstLine, secondLine, thirdLine, forthLine, fifthLine, sixthLine, seventhLine,
                eighthLine, ninthLine);

        Assertions.assertTrue(ValidSudoku.isValidSudoku(sudoku));
    }

    @Test
    void test_invalid_sudoku_returns_false()
    {
        char[] firstLine = new char[9];
        firstLine[0] = '8';
        firstLine[1] = '3';
        firstLine[4] = '7';
        char[] secondLine = new char[9];
        secondLine[0] = '6';
        secondLine[3] = '1';
        secondLine[4] = '9';
        secondLine[5] = '5';
        char[] thirdLine = new char[9];
        thirdLine[1] = '9';
        thirdLine[2] = '8';
        thirdLine[7] = '6';
        char[] forthLine = new char[9];
        forthLine[0] = '8';
        forthLine[4] = '6';
        forthLine[8] = '3';
        char[] fifthLine = new char[9];
        fifthLine[0] = '4';
        fifthLine[3] = '8';
        fifthLine[5] = '3';
        fifthLine[8] = '1';
        char[] sixthLine = new char[9];
        sixthLine[0] = '7';
        sixthLine[4] = '2';
        sixthLine[8] = '6';
        char[] seventhLine = new char[9];
        seventhLine[1] = '6';
        seventhLine[6] = '2';
        seventhLine[7] = '8';
        char[] eighthLine = new char[9];
        eighthLine[3] = '4';
        eighthLine[4] = '1';
        eighthLine[5] = '9';
        eighthLine[8] = '5';
        char[] ninthLine = new char[9];
        ninthLine[4] = '8';
        ninthLine[7] = '7';
        ninthLine[8] = '9';

        char[][] sudoku = createSudoku(firstLine, secondLine, thirdLine, forthLine, fifthLine, sixthLine, seventhLine,
                eighthLine, ninthLine);

        Assertions.assertFalse(ValidSudoku.isValidSudoku(sudoku));
    }

    private char[][] createSudoku(char[]... sudokuLines)
    {
        if(sudokuLines.length != 9)
        {
            throw new IllegalArgumentException("There must be exactly 9 sudoku lines provided");
        }
        char[][] sudoku = new char[9][9];
        System.arraycopy(sudokuLines, 0, sudoku, 0, 9);
        return sudoku;
    }

}