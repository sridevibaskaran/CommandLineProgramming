package commandlineprogramming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EncodeFileCommandLine {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String detail = input.nextLine();
		System.out.println("Text: " + detail);
		String encoded_text = detail.replace("a","n");
		System.out.println("Encoded Text: " + encoded_text);
		String decoded_text = detail.replace("n","a");
		System.out.println("Decoded Text: " + decoded_text);
	}
}
