package commandAndDate;

import java.io.*;

public class GetCammand {
	public  String str =
	 "There is a bug!";
	public  GetCammand() throws IOException {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
			str = reader.readLine();
			
	}

}
