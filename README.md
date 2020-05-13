Create a command line tool (running on jvm) for validating a standard 9x9 Sudoku puzzle:

Command line: validate.bat puzzleName.txt

File format: csv format each line representing a row e.g.:

```
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
```

The program should return 0 (VALID) or non-zero (INVALID) value with an error text on stdout (in case of
an invalid solution or file).

### INSTRUCTION

## In order to build, please use 

mvn clean install 

## In order to an executable jar with dependecies, please use 
mvn package assembly:single
This will generate a jar file with name SudokuSolver-1.0-SNAPSHOT-jar-with-dependencies inside target folder.


## in order to generate report

mvn surefire-report:report

## in order to launch

As it said, please use validate.bat or validate.sh
type on terminal sudovalidate.bat validFile.txt ** It will give VALID as output


type on terminal sudovalidate.bat nonValidFile.txt ** It will give INVALID as output
