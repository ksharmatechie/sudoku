package com.sudoku;
import com.sudoku.adapter.CsvAdapter;

/**
 * @author Kundan Sharma
 */
public class SudokuApplication {

    public static void main(String[] args) {
        CsvAdapter adapter = new CsvAdapter();
        final String[][] sudokugrid= adapter.readDataFromCsVFile(args[0]);
        System.out.println(adapter.isValidSudoku(sudokugrid)? "VALID":"INVALID");

    }


}
