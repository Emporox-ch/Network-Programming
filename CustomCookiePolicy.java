import java.net.*;

public class CustomCookiePolicy implements CookiePolicy {
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        return !uri.getHost().endsWith(".gov");
    }

    public static void main(String[] args) {
        CookieHandler.setDefault(new CookieManager(null, new CustomCookiePolicy()));
        System.out.println("Custom CookiePolicy installed.");
    }
}