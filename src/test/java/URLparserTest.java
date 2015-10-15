import org.junit.Test;

import static org.junit.Assert.*;

public class URLparserTest {

    @Test
    public void testBasicHttpProtocol() {
        URLparser p = new URLparser("http://www.example.com");
        assertTrue(true);
    }

}