import java.util.Comparator;

public class Student implements Comparator<Student>{

	private int id;
	private String name;
	private float gpa;
	
	// empty constructor
	public Student() {
	}
	
	// constructor with fields
	public Student(int id, String name, float gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	// Override compare in the comparator interface
	// returns 1 if s1 is before s2, returns -1 if s2 is before s1
	@Override
	public int compare(Student s1, Student s2) {
		// layer 1: comparing via gpa
		if (s1.getGpa() == s2.getGpa()) {
			// layer 2: comparing by name
			// if =gpa && =name, return id in ascending order
			if (s1.getName().compareToIgnoreCase(s2.getName()) == 0) {
				// layer 3: comparing by id
				if (s1.getId() < s2.getId()) {
					return 1;
				} else {
					return -1;
				}
			} else {
				// if =gpa but !=name return names in alphabetical order
				return s1.getName().compareToIgnoreCase(s2.getName());
			}
		} else if (s1.getGpa() < s2.getGpa()) {
			return 1;
		} else {
			return -1;
		}
	}

   
	//*** GETTERS & SETTERS ***//
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getGpa() {
		return gpa;
	}


	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

}
