import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class rjhc {


public static void main(String[] args) {
String wordlist=args[0];
Integer hashcode=Integer.valueOf(args[1]);


BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
				                    wordlist));
			String line = reader.readLine();
			while (line != null) {
                        Integer linehash=line.toLowerCase().hashCode();

			if (hashcode==linehash)	{System.out.println(line);}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}







}


