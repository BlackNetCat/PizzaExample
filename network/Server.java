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
	   
     int port = 8080; // ��������� ���� (����� ���� ����� ����� �� 1025 �� 65535)
       try {
         ServerSocket ss = new ServerSocket(port); // ������� ����� ������� � ����������� ��� � �������������� �����
         System.out.println("Waiting for a client...");

         Socket socket = ss.accept(); // ���������� ������ ����� ����������� � ������� ��������� ����� ���-�� �������� � ��������
         System.out.println("Got a client");
         System.out.println();

 // ����� ������� � �������� ������ ������, ������ ����� �������� � �������� ������ �������. 
         InputStream sin = socket.getInputStream();
         OutputStream sout = socket.getOutputStream();

 // ������������ ������ � ������ ���, ���� ����� ������������ ��������� ���������.
         DataInputStream in = new DataInputStream(sin);
         DataOutputStream out = new DataOutputStream(sout);

         String line = null;
         while(true) {
           line = in.readUTF(); // ������� ���� ������ ������� ������ ������.
           System.out.println("client just sent me this : " + line);
           if (line.contains("mush")){
        	  
        	   out.writeUTF("Three Mushketers by Alexandr Duma"); 
           }
           
           if (line.contains("island")){
         	  
        	   out.writeUTF(island.getName() + " by " + island.getAuthor().firstName + " " + island.getAuthor().secondName ); // �������� ������� ������� ������
        	 //  System.out.println(island.getName());
           }
           
           else {
        	   out.writeUTF(line + " not found"); // �������� ������� ������� �� ����� ������ ������.
           }
           
      //     System.out.println("I'm sending it back...");
           
           out.flush(); // ���������� ����� ��������� �������� ������.
           System.out.println("Waiting for the next line...");
           System.out.println();
         }
      } catch(Exception x) { x.printStackTrace(); }
   }
}