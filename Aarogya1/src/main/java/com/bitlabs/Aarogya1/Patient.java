package com.bitlabs.Aarogya1;

public class Patient {

	private String name,gender,city,address,g_name,g_address,date_of_admission,recovery;
	private int id,age;
	private long contact_number,aadhar_number,g_contact_number;
	
	public String getRecovery() {
		return recovery;
	}
	public void setRecovery(String recovery) {
		this.recovery = recovery;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_address() {
		return g_address;
	}
	public void setG_address(String g_address) {
		this.g_address = g_address;
	}
	public String getDate_of_admission() {
		return date_of_admission;
	}
	public void setDate_of_admission(String date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public long getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(long aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public long getG_contact_number() {
		return g_contact_number;
	}
	public void setG_contact_number(long g_contact_number) {
		this.g_contact_number = g_contact_number;
	}
}
