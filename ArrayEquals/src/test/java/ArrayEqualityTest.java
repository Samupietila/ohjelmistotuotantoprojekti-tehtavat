package ArrayEquals.src.test.java;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7};
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals(a1, a2, "Should be equal");
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        assertArrayEquals(a11, a12, "Should be equal");
    }

    @Test
    public void testDifferentTypeArrayEquality() {
        String[] a1 = { "2.0", "3.0", "5.0", "7.0" };
        double[] a2 = { 2.0, 3.0, 5.0, 7.0 };
        // a1 have to converted to double array for the assertArrayEquals to work. Otherwise, it will throw an testDifferentTypeArrayEquality error.
        double[] convertedA1 = new double[a1.length];
        for (int i = 0; i < a1.length; i++) {
            convertedA1[i] = Double.parseDouble(a1[i]);
        }
        assertArrayEquals(convertedA1, a2, "Should be equal");
    }
}