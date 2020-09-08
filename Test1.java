import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Handler;

public class Test1 {

    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            byte[] sendBytes = "hello server".getBytes();
            byte[] receiveBytes = new byte[1024];
            datagramSocket
                    .send(new DatagramPacket(sendBytes, sendBytes.length, InetAddress.getByName("127.0.0.1"), 7778));
            DatagramPacket datagramPacket = new DatagramPacket(receiveBytes, receiveBytes.length);
            datagramSocket.receive(datagramPacket);
            byte[] data = datagramPacket.getData();
            int length = datagramPacket.getLength();
            System.out.println(new String(data, 0, length));
            datagramSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
