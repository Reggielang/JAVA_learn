package socketdemo3;

import java.io.IOException;
import java.net.*;

public class Clientdemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String s = "广播hello";
        byte[] bytes = s.getBytes();
        //广播地址
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);

        ds.send(dp);

        ds.close();
    }
}
