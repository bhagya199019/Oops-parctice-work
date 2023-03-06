package com.bitlabs.Aarogya1;
import java.sql.*;
public class DAOImpl implements DAOInterface {
	Connection con=null;
	DAOImpl() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health","root","root");
			if(con!=null) {
				System.out.println("connected");
			}
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}
	
	public void patientRegistration(Patient p) {
		try {
			PreparedStatement ps= con.prepareStatement("insert into Patient values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
	
	ps.setString(1, null);
	ps.setString(2,p.getName());
	ps.setInt(3, p.getAge());
	ps.setString(4, p.getGender());
	ps.setLong(5,p.getAadhar_number());
	ps.setLong(6,p.getContact_number());
	ps.setString(7,p.getCity());
	ps.setString(8,p.getAddress());
	ps.setString(9,p.getDate_of_admission() );
	ps.setString(10,p.getG_name());
	ps.setString(11,p.getG_address());
	ps.setLong(12,p.getG_contact_number());
	ps.setString(13,p.getRecovery());
	int i= ps.executeUpdate();
	if(i>0) {
		System.out.println("Patient data inserted successfully");
	}
	else {
		System.out.println("not inserted please try again");
	}
	}
	catch (Exception e) {
		
		e.printStackTrace();
	}
	}

	public void viewAllPatient() {
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void searchPatientById(int id) {
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient where id='"+id+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	public void searchPatientByCity(String city) {
	
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient where city='"+city+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void searchPatientByAgeGroup(int start, int end) {
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient where age between '"+start+"' and '"+end+"' ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void markPatientRecoveryById(int id) {
		
		try {
			Statement st=con.createStatement();
			int i=st.executeUpdate("update patient set recovery='"+"recovered"+"' where id='"+id+"' ");
			if(i>0) {
				System.out.println("patient has been recovered successfully");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public void deletePatientById(int id) {
	
	try{

	Statement st=con.createStatement();
	int i=st.executeUpdate("delete from patient where id='"+id+"'");
	if(i!=0) {
	
	System.out.println("patient information has been deleted successfully:");
	}
	}
	catch(Exception e) {
	
	e.printStackTrace(); 
	}
	}
	
}

