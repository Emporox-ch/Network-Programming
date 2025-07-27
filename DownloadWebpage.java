import java.io.*;
import java.net.*;

public class DownloadWebpage {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
        String line;
        while ((line = br.readLine()) != null) System.out.println(line);
    }
}
