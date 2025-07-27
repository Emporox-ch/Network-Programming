import java.io.*;
import java.net.*;

    public class DownloadWebpageCharset {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com");
        URLConnection con = url.openConnection();
        String charset = con.getContentEncoding() != null ? con.getContentEncoding() : "UTF-8";

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), charset));
        String line;
        while ((line = in.readLine()) != null) System.out.println(line);
    }
}