package Temp_Convert.src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Temp_Convert.src.main.java.com.example.TemperatureConverter;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.fahrenheitToCelsius(32);
        assertEquals(0, result, 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.celsiusToFahrenheit(0);
        assertEquals(32, result, 0.001);
    }

    @Test
    public void testIsExtremeTemperature() {
        TemperatureConverter converter = new TemperatureConverter();
        boolean result1 = converter.isExtremeTemperature(-50);
        assertTrue(result1);
        
        boolean result2 = converter.isExtremeTemperature(0);
        assertFalse(result2);
        
        boolean result3 = converter.isExtremeTemperature(60);
        assertTrue(result3);
    }
}

