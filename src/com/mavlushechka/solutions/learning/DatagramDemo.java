package com.mavlushechka.solutions.learning;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramDemo {
    public static DatagramSocket datagramSocket;
    public static final int SERVER_PORT = 998;
    public static final int CLIENT_PORT = 999;
    public static final int BUFFER_SIZE = 1024;
    public static final byte[] BUFFER = new byte[BUFFER_SIZE];

    public static void server() throws Exception {
        int position = 0;

        while (true) {
            int data = System.in.read();

            switch (data) {
                case -1:
                    System.out.println("Server Quits.");
                    datagramSocket.close();
                    return;
                case '\r':
                    break;
                case '\n':
                    datagramSocket.send(new DatagramPacket(BUFFER, position, InetAddress.getLocalHost(), CLIENT_PORT));
                    position = 0;
                    break;
                default:
                    BUFFER[position++] = (byte) data;
            }
        }
    }

    public static void client() throws Exception {
        while (true) {
            DatagramPacket datagramPacket = new DatagramPacket(BUFFER, BUFFER.length);

            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            datagramSocket = new DatagramSocket(SERVER_PORT);
            server();
        } else {
            datagramSocket = new DatagramSocket(CLIENT_PORT);
            client();
        }
    }
}
