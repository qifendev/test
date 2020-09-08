import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Test {

    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(7778);
            byte[] sendBytes = "hello client".getBytes();
            byte[] receiveBytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(receiveBytes, receiveBytes.length);
            datagramSocket.receive(datagramPacket);
            byte[] data = datagramPacket.getData();
            InetAddress address = datagramPacket.getAddress();
            int port = datagramPacket.getPort();
            datagramSocket.send(new DatagramPacket(sendBytes, sendBytes.length, address, port));
            System.out.println(new String(data, 0, data.length));
            datagramSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}