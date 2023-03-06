package com.bitlabs.Aarogya1;

public interface DAOInterface {
	public void patientRegistration(Patient p);
	public void viewAllPatient();
	public void searchPatientById(int id);
	public void searchPatientByCity(String city);
	public void searchPatientByAgeGroup(int start,int end);
	public void markPatientRecoveryById(int id);
	public void deletePatientById(int id);
    
}
