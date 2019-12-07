package _04_hospital;

public class Patient {
	boolean cared;
	
	boolean feelsCaredFor() {
		if (cared == true) {
			return true;
		} else {
			return false;
		}
	}

	void checkPulse() {
		cared = true;
	}
}
