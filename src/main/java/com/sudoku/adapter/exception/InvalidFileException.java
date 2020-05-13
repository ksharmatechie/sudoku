package com.sudoku.adapter.exception;

public class InvalidFileException extends RuntimeException {
    public InvalidFileException(String provide_a_valid_file) {
        super(provide_a_valid_file);
    }
}
