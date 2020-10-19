package stacks;
import  java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ColorShapeGame {
	 final static Scanner sc = new Scanner(System.in);
	
	public static void main (String [] args) throws Exception{
		
		String directorio;
		System.out.println("Introduce the directory");
		directorio= sc.nextLine();
		File file =new File(directorio);
		Scanner read =new Scanner (file);
		while(read.hasNextLine()) {
		StringTokenizer tokens = new StringTokenizer(read.nextLine(),";");
			while(tokens.hasMoreTokens()) {
				if (tokens.nextToken().equalsIgnoreCase("square")) {
					Square square=new Square("square",tokens.nextToken());
				}else {
					Star star = new Star ("star");
				}
				
			}
		}
		
	}

}