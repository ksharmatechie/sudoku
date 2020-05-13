

import com.sudoku.adapter.CsvAdapter;
import com.sudoku.adapter.exception.InvalidFileException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * @author Kundan Sharma
 * @version 1.0
 */
public class CsvFileAdapterShould {
  private CsvAdapter adapter = null;

  @Before
  public void init() {
    adapter = new CsvAdapter();
  }

  @Rule
  public ExpectedException expectedEx = ExpectedException.none();
  @Test
  public void throw_an_exception_when_the_file_does_not_exist() {
    expectedEx.expect(InvalidFileException.class);
    expectedEx.expectMessage("Provide a valid file name");
    adapter.readDataFromCsVFile("notExistingFile.txt");
  }



  @Test
  public void return_true_for_a_valid_file()  {
  assertTrue(adapter.isValidSudoku(adapter.readDataFromCsVFile("validFile.txt")));
  }

  @Test
  public void return_false_for_a_non_valid_file()  {
    // when
   assertFalse(adapter.isValidSudoku(adapter.readDataFromCsVFile("nonValidFile.txt")));

  }

  @Test
  public void returns_false_file_contains_not_number_value()  {
    // when
    assertFalse(adapter.isValidSudoku(adapter.readDataFromCsVFile("containsNotNumberValue.txt")));

  }


  @Test
  public void returns_false__when_the_file_has_not_the_correct_size() {
    assertFalse(adapter.isValidSudoku(adapter.readDataFromCsVFile("gridNotCorrectSize.txt")));
    // when and then

  }

  @Test
  public void return_true_for_a_valid_file_with_a_hole()  {
    // when
    assertTrue(adapter.isValidSudoku(adapter.readDataFromCsVFile("validFileWithAHole.txt")));

  }

  @Test
  public void throw_an_exception_when_the_file_contains_not_number_value() {
    assertFalse(adapter.isValidSudoku(adapter.readDataFromCsVFile("containsNotNumberValue.txt")));

  }


}
