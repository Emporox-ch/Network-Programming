
#server
import java.nio.*;
import java.nio.channels.*;
import java.net.*;

public class NIOServer {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel server = ServerSocketChannel.open();
        server.socket().bind(new InetSocketAddress(9000));
        SocketChannel client = server.accept();
        ByteBuffer buffer = ByteBuffer.allocate(256);
        client.read(buffer);
        System.out.println("Received: " + new String(buffer.array()).trim());
        server.close();
    }
}

#client

import java.nio.*;
import java.nio.channels.*;
import java.net.*;

public class NIOClient {
    public static void main(String[] args) throws Exception {
        SocketChannel socket = SocketChannel.open(new InetSocketAddress("localhost", 9000));
        ByteBuffer buffer = ByteBuffer.wrap("Hello from NIO Client".getBytes());
        socket.write(buffer);
        socket.close();
    }
}