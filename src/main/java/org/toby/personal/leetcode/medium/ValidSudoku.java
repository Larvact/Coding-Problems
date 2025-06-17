package org.toby.personal.leetcode.medium;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        return areLinesDistinct(board) && areLinesDistinct(transposeToSudokuByColumn(board)) &&
                areLinesDistinct(transposeToSudokuByBlock(board));
    }

    private static boolean areLinesDistinct(char[][] sudoku)
    {
        for(char[] row : sudoku)
        {
            if(!isLineDistinct(row))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isLineDistinct(char[] sudokuRow)
    {
        HashSet<Character> cachedValues = new HashSet<>();
        for(char cellValue : sudokuRow)
        {
            if(cellValue == '\u0000')
            {
                continue;
            }
            if(cachedValues.contains(cellValue))
                return false;
            else {
                cachedValues.add(cellValue);
            }
        }
        return true;
    }

    private static char[][] transposeToSudokuByColumn(char[][] sudokuByRow)
    {
        char[][] sudokuByColumn = new char[9][9];
        for(int columnIndex = 0; columnIndex < 9; columnIndex++)
        {
            char[] column = new char[9];
            for(int rowIndex = 0; rowIndex < 9; rowIndex++)
            {
                column[rowIndex] = sudokuByRow[rowIndex][columnIndex];
            }
            sudokuByColumn[columnIndex] = column;
        }
        return sudokuByColumn;
    }

    private static char[][] transposeToSudokuByBlock(char[][] sudokuByRow){
        char[][] sudokuByBlock = new char[9][9];
        int blockIndex = 0;
        for(int blockRowStartIndex = 0; blockRowStartIndex != 9; blockRowStartIndex += 3)
        {
            for(int columnRowStartIndex = 0; columnRowStartIndex != 9; columnRowStartIndex += 3)
            {
                sudokuByBlock[blockIndex] =
                        transposeToSudokuBlockSection(sudokuByRow, blockRowStartIndex, columnRowStartIndex);
                blockIndex++;
            }
        }
        return sudokuByBlock;
    }

    private static char[] transposeToSudokuBlockSection(char[][] sudokuByRow, int blockRowStartIndex, int blockRowColumnIndex)
    {
        char[] block = new char[9];
        int position = 0;
        int rowCount = 1;
        for(int rowIndex = blockRowStartIndex; rowCount <= 3; rowIndex++)
        {
            int columnCount = 1;
            for(int columnIndex = blockRowColumnIndex; columnCount <= 3; columnIndex++)
            {
                block[position] = sudokuByRow[rowIndex][columnIndex];
                position++;
                columnCount++;
            }
            rowCount++;
        }
        return block;
    }
}
