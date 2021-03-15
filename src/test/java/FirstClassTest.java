import org.cse222.FirstClass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FirstClassTest {
    @Test
    public void firstMethodTest() {
        FirstClass cls = new FirstClass();
        assertEquals("First String", cls.firstFunction());
    }
}
