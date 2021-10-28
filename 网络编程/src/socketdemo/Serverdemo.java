package socketdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;
/*
注意点：
要先运行接收端，再运行发送端
如果接收端在启动后没有接收到数据，会死等（阻塞）
在接收数据的时候，需要调用一个getLenth方法， 表示接收到了多少字节

UDP通信程序三种通信方式
单播，1对1
组播，1对多
广播，1对所有
 */
public class Serverdemo {
    public static void main(String[] args) throws IOException {
        //1.找码头
        DatagramSocket ds = new DatagramSocket(10000);
        //2.创建一个新的箱子
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //3.接收礼物
        ds.receive(dp);
        //4.从新的箱子里面获取礼物
//        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(bytes,0,length));
        //5.拿完走货
        ds.close();
    }
}
