package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Item{
	
	Word EngRus;
	Item left;
	Item right;
	
	Item (Word EngRus, Item left, Item right){
		this.EngRus = EngRus;
		this.left = left;
		this.right = right;
	}
}

class Word {
	String keyEng;
	String valueRus;
    
         
    Word(String keyEng, String valueRus) {
    	this.keyEng = keyEng;
    	this.valueRus = valueRus;    
    }       
}

public class BinaryTree {
	
	Item root = null;
		
	public Item find(String keyEng) {
		for (Item v = root; v != null; v = (keyEng.compareTo(v.EngRus.keyEng) == -1) ? v.left : v.right)
		     if (keyEng.equals(v.EngRus.keyEng)){
		    	 return v; 
		     }
		
		return null;
	}
		
	public boolean add(Word EngRus) {                    // returns true, if there was no such a key tree
		if (root == null) {                              // if the tree is empty
			root = new Item(EngRus, null, null);         // create a root
			return true;
	    }
	    return add(root, EngRus);                        // otherwise begin to insert a root
	}
	
	private static boolean add(Item node, Word EngRus) {
		if (EngRus.keyEng.compareTo(node.EngRus.keyEng)  == -1) {     // Insert the key less than the current
		     if (node.left == null) {                                 // if not, the left child
		        node.left = new Item(EngRus, null, null);             // insert node there
		     return true;
		                 }
		return add(node.left, EngRus);                                   // otherwise go to the left subtree
		}
		if (EngRus.keyEng.compareTo(node.EngRus.keyEng)  == 1) {         // Insert the key more than the current
			if (node.right == null) {                                    // if not, the right child
		       node.right = new Item(EngRus, null, null);                // insert node there
		       return true;
		    }
		    return add(node.right, EngRus);                             // otherwise go to the right subtree
		}
		return false;
	}

	public static void main(String[] args){
		
		BinaryTree dicEngRus = new BinaryTree();
		String Eng;
		String Rus;
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:\\f\\1.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (sc.hasNext()){
			Eng = sc.next();
			Rus = sc.next();
			dicEngRus.add(new Word(Eng,Rus));
		}
		System.out.println(dicEngRus.find("ccc").EngRus.valueRus);
	}

}
