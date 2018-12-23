package pers.ycy.test7;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @Author:袁阊越
 * @Package：pers.ycy.test7
 * @Date: 2018/12/21 12:08
 * @Description:
 **/

public class ScanningIp {

    public static void main(String[] args) {
        String IP = null;
        for (int i = 0; i <= 150; i++) {
            IP = "172.24.211." + i;
            try {
                InetAddress host = InetAddress.getByName(IP);
                if (host.isReachable(1000)) {
                    String hostName = host.getHostName();
                    System.out.println("IP地址为" + IP + "的知己名称为:" + hostName);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("搜索完毕");
    }
}
