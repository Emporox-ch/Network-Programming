import java.net.*;

public class URIParts {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://example.com/page?name=test#top");
        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("Host: " + uri.getHost());
        System.out.println("Path: " + uri.getPath());
        System.out.println("Query: " + uri.getQuery());
        System.out.println("Fragment: " + uri.getFragment());
    }
}