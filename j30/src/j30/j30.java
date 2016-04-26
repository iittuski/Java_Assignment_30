package j30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class j30 {
	
	public static void main(String args[]){
		
		HashSet<String> arr = new HashSet<String>();
		arr.add("Tushar Thurawa");
		arr.add("Megha Goyal");
		arr.add("Neha Khare");
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
