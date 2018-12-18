package pers.ycy.test7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(9527);
            System.out.println("服务器启动完成");
            socket = server.accept();
            System.out.println("创建客户连接");
            InputStream inputStream = socket.getInputStream();
            InputStreamReader isReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isReader);
            while (true) {
                String readLine = reader.readLine();
                if (readLine.equals("exit"))
                    break;
                System.out.println("接收到的内容" + readLine);
            }
            System.out.println("断开连接");
            reader.close();
            isReader.close();
            inputStream.close();
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}