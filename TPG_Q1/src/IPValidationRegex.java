import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IPValidationRegex {
	// basic ip address regex
	private String format = "[0-9][0-9]?[0-9]?\\.[0-9][0-9]?[0-9]?\\.[0-9][0-9]?[0-9]?\\.[0-9][0-9]?[0-9]?";
	
	public static void main(String[] args) {
		IPValidationRegex ipvr = new IPValidationRegex();
		ipvr.run(args);
	}
	
	public void run(String[] args) {
		// Scan input file
		File file = new File(".\\src\\test.txt");
        try {
        	Scanner input = new Scanner(file);
        	System.out.println("VALID IP ADDRESSES:");
        	// continue scanning each line
        	// check if each string is valid and print valid strings
			while (input.hasNext()) {
				String s = input.nextLine();
				s = s.trim();
				if (isValid(s)) {
					System.out.println(s);
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isValid(String s) {
		// if string passes basic ip regex
		if(s.matches(format)) {
			String[] ipArray = s.split("\\.");
			// check each section of the ip separated by "." is 0-255
			for (int i = 0; i < ipArray.length; i++) {
				int octet = Integer.parseInt(ipArray[i]);
				if (octet < 0 || octet > 255) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
}
