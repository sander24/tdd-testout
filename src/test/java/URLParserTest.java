import org.junit.Test;

import static org.junit.Assert.*;

public class URLParserTest {

  @Test
  public void testBasicHttpProtocol() {
    URLParser p = new URLParser("http://www.example.com");
    assertTrue("http".equals(p.getProtocol()));
  }

  @Test
  public void testDefaultPort() {
    URLParser p = new URLParser("http://www.example.com");
    assertTrue(p.getPort() == 80);
  }

  @Test
  public void testPortParsing() {
    URLParser p = new URLParser("http://localhost:8080");
    assertTrue(p.getPort() == 8080);
  }
}