import org.junit.Test;

import static org.junit.Assert.*;

public class URLparserTest {

    @Test
    public void testBasicHttpProtocol() {
        URLparser p = new URLparser("http://www.example.com");
        assertTrue("http".equals(p.getProtocol()));
    }

    @Test
    public void testDefaultPort() {
        URLparser p = new URLparser("http://www.example.com");
        assertTrue(p.getPort() == 80);
    }

    @Test
    public void testPortParsing() {
        URLparser p = new URLparser("http://localhost:8080");
        assertTrue(p.getPort() == 8080);
    }
}