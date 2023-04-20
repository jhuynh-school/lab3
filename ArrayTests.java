import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1, 2, 3, 4, 5};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAWLEmptyArray() {
    double[] input1 = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAWLOneNum() {
    double[] input1 = {1};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAWLSameNum() {
    double[] input1 = {5, 5, 5};
    assertEquals(5, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}

