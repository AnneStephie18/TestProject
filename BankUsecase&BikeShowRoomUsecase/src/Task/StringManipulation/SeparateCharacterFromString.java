package Task.StringManipulation;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * 
 * @author Anne.Sivakumar
 *This class is used to separate alphabets, digits and special characters  from given string
 */
public class SeparateCharacterFromString {
	static Logger log=Logger.getLogger("log information");
	public static void main(String[] args) {
		
		
		splitString();
	}
	/**
	 * using string buffer check the given string is alphabets,digits,special characters in the given string
	 * @param str
	 * @return alphabets,digits,special characters
	 */
	static StringBuffer splitString() {
		Scanner sc = new Scanner(System.in);
		log.info("Enter the string");
		String string = sc.next();
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i)))
				 num.append(string.charAt(i));
			else if (Character.isAlphabetic(string.charAt(i)))
				 alpha.append(string.charAt(i));
			else
				 special.append(string.charAt(i));
		}

		log.info("Alphabets in the given String: "+ alpha);
		log.info("Digits  in the given String: "+ num);
		log.info("Special Characters in the given String: "+ special);
		return alpha;
		
	}
}