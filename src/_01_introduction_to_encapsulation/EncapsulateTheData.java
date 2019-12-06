package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	public void setitemsReceived(int itemsRecieved) {
		if (itemsRecieved < 0) {
			this.itemsReceived = 0;
		} else {
			this.itemsReceived = itemsRecieved;
		}
	}
	public int getitemsReceived() {
		return itemsReceived;
	}

	
	public void setdegreesTurned(float degreesTurned) {
		if (degreesTurned > 0.0 && degreesTurned < 360.0) {
			this.degreesTurned = degreesTurned;
		}

	}
	public float getdegreesTurned() {
		return degreesTurned;
	}
	
	
	public void setnomenclature(String nomeclature) {
		if (nomeclature.equals("")) {
			this.nomenclature = " ";
		}
		else {
			this.nomenclature = nomenclature;
		}
	}
	public String getnomneclature() {
		return nomenclature;
	}
	
	
	public void setmemberObj(Object memeberObj) {
		if (memberObj instanceof String ) {
			this.memberObj = (Object) memeberObj;
		}
		else {
			this.memberObj = memberObj;
		}
	}
	public Object getmemberObj() {
		return memberObj;
	}
	
	
	public static void main(String[] args) {
		EncapsulateTheData run = new EncapsulateTheData();
		int x = -4;
		run.setitemsReceived(x);
		System.out.println(run.getitemsReceived());
		
		float testNum = (float) 4.0;
		run.setdegreesTurned(testNum);
		System.out.println(run.getdegreesTurned());
		
		String testString = "";
		run.setnomenclature(testString);
		System.out.println(run.getnomneclature());
		
		Object testObject = 5;
		run.setmemberObj(testObject);
		System.out.println(run.getmemberObj());
		
	}
}
