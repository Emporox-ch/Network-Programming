import java.net.*;

public class URLEncoderExample {
    public static void main(String[] args) throws Exception {
        String data = "name=rohan&email=test@example.com";
        String encoded = URLEncoder.encode(data, "UTF-8");
        System.out.println(encoded);
    }
}