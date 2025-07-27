
import java.net.*;

public class ConfigureURLConnection {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        System.out.println("Configured URLConnection: " + con.getURL());
    }
}