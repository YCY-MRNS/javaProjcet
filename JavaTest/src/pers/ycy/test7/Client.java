package pers.ycy.test7;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.11.68", 5209);
            OutputStream out = socket.getOutputStream();
            out.write("这是第一次".getBytes());
            out.write("Start".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
