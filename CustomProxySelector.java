import java.io.IOException;
import java.net.*;
import java.util.*;

public class CustomProxySelector extends ProxySelector {
    private final Map<URI, Proxy> remembered = new HashMap<>();

    public List<Proxy> select(URI uri) {
        return List.of(remembered.getOrDefault(uri, Proxy.NO_PROXY));
    }

    public void connectFailed(URI uri, SocketAddress sa, IOException e) {
        remembered.put(uri, Proxy.NO_PROXY); // Simple remember logic
    }

    public static void main(String[] args) {
        ProxySelector.setDefault(new CustomProxySelector());
        System.out.println("Custom ProxySelector installed.");
    }
}
