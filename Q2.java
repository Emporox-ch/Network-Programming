
import java.net.InetAddress;

public class Q2 {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getLocalHost();
            String answer = inet.getHostAddress();
            System.out.print(answer);
        } catch (Exception e) {
            System.err.println("Eroor");
        }
    }
}
