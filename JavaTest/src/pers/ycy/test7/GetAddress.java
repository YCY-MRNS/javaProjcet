package pers.ycy.test7;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author:袁阊越
 * @Package：pers.ycy.test7
 * @Date: 2018/12/21 12:08
 * @Description:
 **/

public class GetAddress {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.cqust.edu.cn");
            InetAddress localHost = InetAddress.getByName("localhost");

            String hostAddress = inetAddress.getHostAddress();
            String localHostName = localHost.getHostName();
            String hostAddress1 = localHost.getHostAddress();

            System.out.println("这是www.cqust.edu.cn的ip地址：" + hostAddress);
            System.out.println("这是本地的名称：" + localHostName);
            System.out.println("这是本地的ip地址：" + hostAddress1);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
