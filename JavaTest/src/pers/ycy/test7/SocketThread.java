package pers.ycy.test7;

import java.io.*;
import java.net.Socket;

/**
 * @Author:袁阊越
 * @Package：pers.ycy.test7
 * @Date: 2018/12/21 12:08
 * @Description:
 **/

public class SocketThread extends Thread {
    private Socket socket = null;

    SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        super.run();
        OutputStream outputStream = null;
        PrintWriter printWriter = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        InputStream inputStream = null;

        try {
            inputStream = socket.getInputStream();

            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            outputStream = socket.getOutputStream();
            printWriter = new PrintWriter(outputStream);

            String getContent = null;
            while ((getContent = reader.readLine()) != null) {
                System.out.println(getContent);
                printWriter.print("Let’s have class!");
                printWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.shutdownInput();
                socket.shutdownOutput();
                outputStream.close();
                printWriter.close();
                inputStream.close();
                inputStreamReader.close();
                reader.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
