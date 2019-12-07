package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	public ArrayList<Patient> patients = new ArrayList<Patient>();
	public ArrayList<Doctor> doc = new ArrayList<Doctor>();

	public void addDoctor(Doctor doctor) {
		doc.add(doctor);
	
	}

	public ArrayList<Doctor> getDoctor() {
		return doc;
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public ArrayList<Patient> getpatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		int count = 0;
		
		for (int i = 0; i < patients.size(); i++) {
			try {
				doc.get(count).assignPatient(patients.get(i));
			} catch (DoctorFullException dfe) {
				// TODO: handle exception
				count++;
				i--;
			}
			
		}
	}
}
