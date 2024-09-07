
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.example.StringManipulatorYourName;

public class StringManipulatorYourNameTest {
    @BeforeClass
    public static void start() {
        System.out.println("Starting tests...");
    }
    @AfterClass
    public static void end() {
        System.out.println("Ending tests...");
    }
    @Before
    public void beforeEach() {
        System.out.println("Running test...");
    }
    @After
    public void after() {
        System.out.println("Test complete.");
    } 

    @Test
    public void testReverse() {
        StringManipulatorYourName manipulator = new StringManipulatorYourName();
        String input = "InnostunutSonni";
        String expected = "innoStunutsonnI";
        String actual = manipulator.reverse(input);
        assert(expected.equals(actual));
    }

    @Test
    public void testCapitalize() {
        StringManipulatorYourName manipulator = new StringManipulatorYourName();
        String input = "hey, this text should be capitalized!";
        String expected = "HEY, THIS TEXT SHOULD BE CAPITALIZED!";
        String actual = manipulator.capitalize(input);
        assert(expected.equals(actual));
    }
}
