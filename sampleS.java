import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Base64;

class samples
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		String input = "";
		
		do
		{
			input = scan.next();
			words.add(input);
		}
		while (!input.equals(":q"));
		{
		
		
			for(String a : words)
			{
				
				System.out.println ("Save or Discard?");
				String choose = scan.next();
				
				if(choose.equals("save"))
				{
					String base64 = Base64.getEncoder() .encodeToString(a.getBytes());
					System.out.println("Input File name:");
					String fileName = scan.next();
					FileWriter fw = new FileWriter( fileName +".jgh");
					fw.write(a);
					
					break;
				}	
				else
				{
					System.out.println("bahala na");
				}
			}
			
		
				
		}
		
		
	}
}