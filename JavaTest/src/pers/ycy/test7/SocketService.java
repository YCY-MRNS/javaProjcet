package pers.ycy.test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketService {
    //搭建服务器端
    public static void main(String[] args) throws IOException {

        try {
            ServerSocket server = null;
            try {
                server = new ServerSocket(5209);
                System.out.println("服务器启动成功");
            } catch (Exception e) {
                System.out.println("没有启动监听：" + e);
            }
            Socket socket = null;
            try {
                socket = server.accept();
            } catch (Exception e) {
                System.out.println("Error." + e);
            }
            String line;
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Client:" + in.readLine());
            line = br.readLine();
            while (!line.equals("end")) {

                writer.println(line);
                writer.flush();
                System.out.println("服务:" + line);
                System.out.println("客户:" + in.readLine());
                line = br.readLine();
            }

            //5、关闭资源
            writer.close(); //关闭Socket输出流
            in.close(); //关闭Socket输入流
            socket.close(); //关闭Socket
            server.close(); //关闭ServerSocket
        } catch (Exception e) {//出错，打印出错信息
            System.out.println("Error." + e);
        }
    }
}
