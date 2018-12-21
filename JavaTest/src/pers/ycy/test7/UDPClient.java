package pers.ycy.test7;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            DatagramSocket socket = new DatagramSocket();
            byte[] data = "hello".getBytes();
            DatagramPacket dp = new DatagramPacket(data, data.length, address, 9527);
            socket.send(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
