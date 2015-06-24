/** Purpose: Encode and Decode a file in Java */


package commandlineprogramming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EncodeFile {
	public static void main(String[] args) throws IOException {
		try{
			BufferedReader br = new BufferedReader(new FileReader("/Users/yogeshchinta/Documents/encode.txt"));
			String currentLine;
		
			while((currentLine=br.readLine()) != null){
				String str = currentLine;
				System.out.println("Text: " + str);
				String encoded_text = str.replace("a","n");
				System.out.println("Encoded Text: " + encoded_text);
				String decoded_text = str.replace("n","a");
				System.out.println("Decoded Text: " + decoded_text);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File Not found");
		}
		
	}
}
