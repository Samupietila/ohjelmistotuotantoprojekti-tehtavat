import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import com.example.SamuDocker;

public class SamuDockerTest {
    @org.junit.jupiter.api.Test
    public void testMain() {
        String input = "Samu";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    
        SamuDocker.main(new String[0]);
    
        String expectedOutput = "Hello, what is your name?: "+"\n"+"Hello, Samu!\n";
        assertEquals(expectedOutput, out.toString());
    }
}
