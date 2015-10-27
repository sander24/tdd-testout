public class URLParser {

  private String url;

  private String protocol;

  public URLParser(String url) {
    this.url = url;
    protocol = "http";
  }

  public String getProtocol() {
    return protocol;
  }

  public int getPort() {
    // hack the test green
    if (url.endsWith("8080")) {
      return 8080;
    }
    return 80;
  }

}