package week3day1.org.system;

public class desktop extends computer {
	
	public void desktopSize() {
		
		System.out.println("Size of the Desktop: 20.0 inch");
	}
	
	public static void main(String[] args) {
		
		// Single Inheritance//
		desktop desktop = new desktop();
		desktop.computerModel();
		desktop.desktopSize();
		
	}

}
