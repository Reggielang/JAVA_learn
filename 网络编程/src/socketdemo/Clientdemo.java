package socketdemo;

import java.io.IOException;
import java.net.*;
//发送端
public class Clientdemo {
    public static void main(String[] args) throws IOException {
        //1.找码头
        DatagramSocket ds = new DatagramSocket();
        //2.打包礼物
        String s = "送给村长的礼物。";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        //3.码头发送包裹
        ds.send(dp);
        //4.付钱走货
        ds.close();
    }
}
