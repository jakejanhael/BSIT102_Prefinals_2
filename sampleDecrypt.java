import java.io.File;
import java.io.*;
import java.util.Scanner;


 class Output_file
{
		public static void main(String[]args) throws Exception
		{
			Base64.Decoder decrypt = Base64.getDecoder();
			System.out.println("Enter the file name :");
			Scanner scn = new Scanner(System.in);1
		
			File file = new File(scn.nextLine() + ".jgh");
			scn = new Scanner(file);
			
			String lines = scn.nextLine();
			System.out.println(lines);
			
		
			
			
			
		}
}