public class URLparser {

    private String protocol;

    public URLparser(String url) {
        protocol = "http";
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return 80;
    }

}