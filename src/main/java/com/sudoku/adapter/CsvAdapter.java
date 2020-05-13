package com.sudoku.adapter;
import com.opencsv.CSVReader;
import com.sudoku.adapter.exception.InvalidFileException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CsvAdapter {
    public   String[][] readDataFromCsVFile(String fileName)  {
        CSVReader csvReader = null;
        List<String[]> list = null;
        try {
            csvReader = new CSVReader(new FileReader(new File(fileName)));
            list = csvReader.readAll();
        } catch (IOException e) {
            throw new InvalidFileException("Provide a valid file name");
        }
        // Convert to 2D array
        String[][] dataArr = new String[list.size()][];
        dataArr = list.toArray(dataArr);

        return dataArr;
    }

    public boolean isValidSudoku(String[][] board){
        List<String> lst = new ArrayList<>();
        Set<String> visited = new HashSet<String>();
        for(int row=0; row<9; row++){
            for(int col=0; col<9; col++){
                String currentNum= board[row][col].trim();
                if(!currentNum.equals(".")){
                    if(!visited.add(currentNum + "found in row "+ row) ||
                            (!visited.add(currentNum + "found in column " + col)) ||
                            (!visited.add(currentNum + "found in sub box " + row/3 + "-" + col/3))) return false;
                }

            }
        }

        return true;
    }

}
