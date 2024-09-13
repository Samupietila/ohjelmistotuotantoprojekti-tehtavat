
import temp_convert.TempConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TempConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        TempConverter converter = new TempConverter();
        double result = converter.fahrenheitToCelsius(32);
        assertEquals(0, result, 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        TempConverter converter = new TempConverter();
        double result = converter.celsiusToFahrenheit(0);
        assertEquals(32, result, 0.001);
    }

    @Test
    public void testIsExtremeTemperature() {
        TempConverter converter = new TempConverter();
        boolean result1 = converter.isExtremeTemperature(-50);
        assertTrue(result1);
        
        boolean result2 = converter.isExtremeTemperature(0);
        assertFalse(result2);
        
        boolean result3 = converter.isExtremeTemperature(60);
        assertTrue(result3);
    }
}
