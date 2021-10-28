package Inetaddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
网络编程三要素：
IP：设备在网络中的唯一标识
端口号：应用程序在设备中的唯一标识
协议：数据在传输过程中遵守的规则
 */

public class Inetaddressdemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-L8RACR2");
        String hostName = address.getHostName();
        System.out.println("主机名为"+hostName);
        String hostAddress = address.getHostAddress();
        System.out.println("ID为"+hostAddress);
    }
}
