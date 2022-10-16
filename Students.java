package week3day1.student2;

public class Students {

	// Description: Create multiple getStudentInfo() method by passing id argument
	// alone, by id & name, by email & phoneNumber
	
	public void getStudentInfo(int id) {
		
		System.out.println(" Students class ---> getStudentInfo when id is passed: " +id);
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Students class ---> getStudentInfo when id & name is passed: " +id +" "+name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		
		System.out.println("Students class ---> getStudentInfo when email & phoneNumber is passed: " +email +" "+phoneNumber);
	}
	
	public static void main(String[] args) {
		
		Students stud = new Students();
		
		stud.getStudentInfo(2440408);
		stud.getStudentInfo(2440408, "Hema");
		
		stud.getStudentInfo("hema@gmail.com",27234867);
		
	}
	
	
}
