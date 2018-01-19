package commandAndDate;



import java.util.regex.*;

public class Check {
	public boolean isMatch;

	public Check(String string) {

		String pattern = "[0-9][0-9]";
				

			isMatch = Pattern.matches(pattern, string);
 
		
	
	}

	public boolean getcoolean() {
		return isMatch;
	}



}


