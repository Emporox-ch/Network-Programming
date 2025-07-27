
import java.net.*;
import java.util.*;

public class GetCookies { 
    public static void main(String[] args) throws Exception {
        CookieManager cm = new CookieManager();
        CookieHandler.setDefault(cm);
        new URL("https://www.google.com").openConnection().getContent();

        for (HttpCookie cookie : cm.getCookieStore().getCookies()) {
            System.out.println(cookie);
        }
    }
}
