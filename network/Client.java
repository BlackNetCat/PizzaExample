package network;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Client {
    public static void main(String[] ar) {
        int serverPort = 8080; 
        String address = "127.0.0.1";                                       

        try {
            InetAddress ipAddress = InetAddress.getByName(address); // ������� ������ ������� ���������� ������������� IP-�����.
            System.out.println("Any of you heard of a socket with IP address " + address + " and port " + serverPort + "?");
            Socket socket = new Socket(ipAddress, serverPort); // ������� ����� ��������� IP-����� � ���� �������.
            System.out.println("Connect complete");

            // ����� ������� � �������� ������ ������, ������ ����� �������� � �������� ������ ��������. 
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // ������������ ������ � ������ ���, ���� ����� ������������ ��������� ���������.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            // ������� ����� ��� ������ � ����������.
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            System.out.println("Input name of Book");
            System.out.println();

            while (true) {
            	line = keyboard.readLine(); // ���� ���� ������������ ������ ���-�� � ������ ������ Enter.
            	         	
                System.out.println("request is being processed");
                out.writeUTF(line); // �������� ��������� ������ ������ �������.
                out.flush(); // ���������� ����� ��������� �������� ������.
                line = in.readUTF(); // ���� ���� ������ ������� ������ ������.
                System.out.println(line);
                System.out.println("Go ahead and enter more lines.");
                System.out.println();
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}