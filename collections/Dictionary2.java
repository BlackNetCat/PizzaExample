package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dictionary2 {
	
	static Map<String, String> dictionary;
	
	static Map<String, String> enru = new TreeMap<>();
	static Map<String, String> ruen = new TreeMap<>();
	
	static Scanner reader = new Scanner(System.in);
	static Scanner reader2 = new Scanner(System.in);
	
	
	public static void menu() {
		
		System.out.println("select dictonary (1 - enru, 2 - ruen )");		
	
			int typing = reader.nextInt();	
		
		switch (typing) {
			case 1: dictionary = enru;
			System.out.println("you select English-Russian Dictionary");
	//		Scanner sc = new Scanner(new File("C:\\f\\enru.txt"));
			break;
			case 2: dictionary = ruen;
			System.out.println("you select Russian-English Dictionary");
			break;
			}
		}
	
	public static void translate (){
		
		System.out.println("Input word :");
	
			String s = reader.next();
			System.out.println(dictionary.get(s));				
	}
	
	public static void fillDictonary(){
		
		enru.put("train", "poezd, sostav");
		enru.put("ship", "korabl, lodka");
		enru.put("plane", "samolet, istrebitel");
		
		ruen.put("poezd", "train");
		ruen.put("korabl", "ship, boat");
		ruen.put("samolet", "plane, airctafr");		
		
		
	}
	
	public static void main(String[] args) {
			
		menu();
		fillDictonary();		
		translate();
		
	}

}
