package Task.StringManipulation;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Logger;
/**
 * 
 * @author Anne.Sivakumar
 *This class is used to remove additional delimiter from below string
 */
public class RemoveAdditionalDelimiter {

	public static void main(String[] args) {
		//calling eliminateDelimiter method
		eliminateDelimiter();
	}
	/**
	 * 
	 * @return the string without having delimiter in the given string
	 *  StringTokenizer is a predefined class based on split operation it works
	 */
	public static StringTokenizer eliminateDelimiter()
	{
		Logger log=Logger.getLogger("log information");
		Scanner sc = new Scanner(System.in);
		log.info("Enter the string");
		String str = sc.next();
		StringTokenizer defaultTokenizer = new StringTokenizer(str,",[ !\\\"#$%&'()*+,-./:;<=>?@\\\\[\\\\]^_`{|}~]");
		log.info("Total number of tokens found : " + defaultTokenizer.countTokens());

		while (defaultTokenizer.hasMoreTokens()) {
			log.info(""+defaultTokenizer.nextToken());
		}
		return defaultTokenizer;
	}
}
