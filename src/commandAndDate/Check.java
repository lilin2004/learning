package commandAndDate;



import java.util.regex.*;

public class Check {
	public boolean isMatch;

	public Check(String string) {

		String pattern = "^[0-9][0-9]([02468][048]|[13579][26])\\.(0{0,1}([13578]|10|12)\\.(0{0,1}[1-9]|[12][0-9]|3[01])|0{0,1}([2469]|11)\\.(0{0,1}[1-9]|[12][0-9]|30))(|\\.(0[1-9]|[1-9]|1[0-9]\2[1-3])|\\.(0{0,1}[0-9]|[1-5][0-9])\\.(0{0,1}[0-9]|[1-5][0-9])|\\.(0{0,1}[0-9]|[1-5][0-9])\\.(0{0,1}[0-9]|[1-5][0-9])\\.(0{0,1}[0-9][0-9]|0{0,2}[0-9]|0{1,3}|[0-9]{3}))$";

		isMatch = Pattern.matches(pattern, string);
 
		
	
	}

	public boolean getcoolean() {
		return isMatch;
	}



}


