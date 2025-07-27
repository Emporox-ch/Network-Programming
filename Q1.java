import java.net.InetAddress;

public class Q1 {
    public static void main(String[] args) {
        try {
            // Get the local host information
            InetAddress inetAddress = InetAddress.getLocalHost();

            // Display hostname and IP address
            System.out.println("Hostname: " + inetAddress.getHostName());
            System.out.println("Local IP Address: " + inetAddress.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
