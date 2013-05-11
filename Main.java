package Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
    File file = new File("/Users/mahmoodcontractor/Desktop/testing");
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
    	String strWithoutSpaces = line.replaceAll("\\s+", "");
		int lastDigitInString  = Character.getNumericValue(strWithoutSpaces.charAt(strWithoutSpaces.length()-1));
		int lengthOfString = strWithoutSpaces.length()-1;
		int indexOfMElement = (lengthOfString-lastDigitInString);
		
		if(lastDigitInString!=0 && lastDigitInString<=lengthOfString)
		{
			System.out.println(strWithoutSpaces.charAt(indexOfMElement));
		}
    
        }
    }
  }

