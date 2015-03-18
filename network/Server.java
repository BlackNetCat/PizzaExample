package network;

import java.net.*;
import java.util.ArrayList;
import java.io.*;
public class Server {

	public static void main(String[] ar)    {
	   
		Book island = new Book();
		Author juelvern = new Author();
		ArrayList<Integer> juelBookCode = new ArrayList<Integer>();
			
		island.setCode(01);
		island.setName("Mysterius Island");
		island.setAuthor(juelvern);
			
		juelvern.setFirstName("Juel");
		juelvern.setSecondName("Vern");
			
		juelvern.setBooksCode(juelBookCode);
		juelBookCode.add(01);   
	   
     int port = 8080; // случайный порт (может быть любое число от 1025 до 65535)
       try {
         ServerSocket ss = new ServerSocket(port); // создаем сокет сервера и привязываем его к вышеуказанному порту
         System.out.println("Waiting for a client...");

         Socket socket = ss.accept(); // заставляем сервер ждать подключений и выводим сообщение когда кто-то связался с сервером
         System.out.println("Got a client");
         System.out.println();

 // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту. 
         InputStream sin = socket.getInputStream();
         OutputStream sout = socket.getOutputStream();

 // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
         DataInputStream in = new DataInputStream(sin);
         DataOutputStream out = new DataOutputStream(sout);

         String line = null;
         while(true) {
           line = in.readUTF(); // ожидаем пока клиент пришлет строку текста.
           System.out.println("client just sent me this : " + line);
           if (line.contains("mush")){
        	  
        	   out.writeUTF("Three Mushketers by Alexandr Duma"); 
           }
           
           if (line.contains("island")){
         	  
        	   out.writeUTF(island.getName() + " by " + island.getAuthor().firstName + " " + island.getAuthor().secondName ); // отсылаем клиенту обратно автора
        	 //  System.out.println(island.getName());
           }
           
           else {
        	   out.writeUTF(line + " not found"); // отсылаем клиенту обратно ту самую строку текста.
           }
           
      //     System.out.println("I'm sending it back...");
           
           out.flush(); // заставляем поток закончить передачу данных.
           System.out.println("Waiting for the next line...");
           System.out.println();
         }
      } catch(Exception x) { x.printStackTrace(); }
   }
}