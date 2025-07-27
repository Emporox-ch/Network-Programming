import java.net.*;
public class Q4 {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getLocalHost();
            System.out.println("Ip address ="+inet.getLocalHost());

            if (inet instanceof Inet4Address) {
                System.out.println("It is IpV4"); 

            }
            else if(inet instanceof Inet6Address){
                System.out.println("It is IpV6");
            }
            else{
                System.out.println("Unknown ip address");
            }
        } catch (UnknownHostException e) {
            System.err.println("Eroor ");
        }
    }
}
