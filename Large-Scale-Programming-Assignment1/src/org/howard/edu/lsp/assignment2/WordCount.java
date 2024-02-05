package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("src/org/howard/edu/lsp/assignment2/words.txt");
		Scanner scan = new Scanner(f);
		Map<String, Integer> storage = new HashMap<>();
	
		while(scan.hasNext()) {
			String words = scan.next().toLowerCase().replaceAll("\\p{Punct}","'");

			String[] array = words.split("'", words.length());
			
			
			for(String eye: array) {
				
				
				if(eye.matches("\\d+")) {
					continue;
				}
				if(eye.length()<=3) {
					continue;
				
				}else {
					if(storage.containsKey(eye)) {
						storage.put(eye, storage.get(eye)+1);
					}else {
						storage.put(eye, 1);
					}

				}
			}

 
		}
		System.out.print(storage);
		
		
		
		
		

	}

}
