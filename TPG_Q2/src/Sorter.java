import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorter {

	public static void main(String[] args) {
		Sorter s = new Sorter();
		s.run();
	}
	
	public void run() {
		// Create ArrayList to store student information
		ArrayList<Student> Students = new ArrayList<Student>();
		// Scan input file
		File file = new File(".\\src\\test.txt");
    	try {
			Scanner input = new Scanner(file);
			// Store each line of file
			while (input.hasNext()) {
				String s = input.nextLine();
				s = s.trim();
				String[] array = s.split("[\\t\\s]+");
				int id = Integer.parseInt(array[0].trim());
				String name = array[1].trim();
				float gpa = Float.parseFloat(array[2].trim());
				// create student object from data
				Students.add(new Student(id,name,gpa));
			}
			input.close();
			
			// sort ArrayList using comparator
			Collections.sort(Students, new Student());
			// print output
			for (Student s: Students) {
				System.out.println(s.getName());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
