package pers.ycy.test7;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        byte[] buf = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(buf, buf.length);

        try {
            DatagramSocket socket = new DatagramSocket(9527);
            socket.receive(dp1);
            int length = dp1.getLength();
            String message = new String(dp1.getData(), 0, length);
            String ip = dp1.getAddress().getHostAddress();
            System.out.println(ip + ":" + message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
