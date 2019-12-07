package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients2 = new ArrayList<Patient>();

	boolean performsSurgery() {
		return false;
	}

	boolean makesHouseCalls() {
		return false;
	}

	void assignPatient(Patient patients) throws DoctorFullException {
		if (patients2.size() > 2) {
			throw new DoctorFullException();
		} else {
			patients2.add(patients);
		}
	}

	ArrayList<Patient> getPatients(){
		return patients2;
	}
void doMedicine() {
	for (Patient patients : patients2) {
		patients.cared = true;
	}
}
}
