package commandAndDate;



import java.util.regex.*;

public class Check {
	public boolean isMatch;

	public Check(String string) {

		String pattern = "";

		isMatch = Pattern.matches(pattern, string);
 
		
	
	}

	public boolean getcoolean() {
		return isMatch;
	}



}


