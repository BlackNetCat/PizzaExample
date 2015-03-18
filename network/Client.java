package network;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Client {
    public static void main(String[] ar) {
        int serverPort = 8080; 
        String address = "127.0.0.1";                                       

        try {
            InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
            System.out.println("Any of you heard of a socket with IP address " + address + " and port " + serverPort + "?");
            Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
            System.out.println("Connect complete");

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиентом. 
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            // Создаем поток для чтения с клавиатуры.
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            System.out.println("Input name of Book");
            System.out.println();

            while (true) {
            	line = keyboard.readLine(); // ждем пока пользователь введет что-то и нажмет кнопку Enter.
            	         	
                System.out.println("request is being processed");
                out.writeUTF(line); // отсылаем введенную строку текста серверу.
                out.flush(); // заставляем поток закончить передачу данных.
                line = in.readUTF(); // ждем пока сервер отошлет строку текста.
                System.out.println(line);
                System.out.println("Go ahead and enter more lines.");
                System.out.println();
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}