package com.bitlabs.Aarogya1;

import java.io.*;
import java.util.*;


public class App 
{
    private static Scanner s;
	private static BufferedReader br;


    public static void main(String args[]) throws IOException{
		DAOInterface di=new DAOImpl();

		Patient pt[]=new Patient[1];
		 s= new Scanner(System.in);
		
		boolean b= true;
		try {
			FileReader fr= new FileReader("patient1info.csv");
			br = new BufferedReader(fr);
			while(b) {
				System.out.println("**********MENU***********");
				System.out.println("1.Patient Registration\n2.View All Patient\n3.Search Pateint by ID\n4.Search Patient by City\n5.Search Patient by age group\n6. Change the Recovery Status\n7. Delete the patient by id\n0. For exit  ");
				System.out.println("Enter the choice");
				int num=s.nextInt();
				switch(num) {
				case 1:
					String str;
					while((str=br.readLine())!=null) {
						int i=0;
						pt[i]=new Patient();
						String arr[]=str.split(",");
						pt[i].setName(arr[0]);
						if(arr[1].length()<=2) {
							pt[i].setAge(Integer.parseInt(arr[1]));
						}
						else {
							System.out.println("invalid age");
							break;
						}
						
						pt[i].setGender(arr[2]);
						System.out.println(arr[3].length());
						
						if(arr[3].length()==12) {
							
							pt[i].setAadhar_number(Long.parseLong(arr[3]));
						}	
						else {
							System.out.println("invalid addhar card number");
							break;
						}
						if(arr[4].length()==10) {
							pt[i].setContact_number(Long.parseLong(arr[4]));
						}
						else {
							System.out.println("contact number invalid");
							break;
						}
						
						pt[i].setCity(arr[5]);
						pt[i].setAddress(arr[6]);
						pt[i].setDate_of_admission(arr[7]);
						pt[i].setG_name(arr[8]);
						pt[i].setG_address(arr[9]);
						pt[i].setG_contact_number(Long.parseLong(arr[10]));
						pt[i].setRecovery(arr[11]);
						
						di.patientRegistration(pt[i]);
						i++;
					}	
					break;
		
        case 2: 
    	     di.viewAllPatient();
    	      break;
       case 3:
    	     System.out.println("enter patient id");
    	     int id=s.nextInt();
    	     di.searchPatientById(id);
    	     break;
       case 4:
     	     System.out.println("enter patient city");
    	     String city1=s.next();
    	     di.searchPatientByCity(city1);
    	     break;
       case 5:
    	     System.out.println("enter the patient age group limit between(start and end)");
    	     int start1=s.nextInt();
    	     int end1=s.nextInt();
    	     di.searchPatientByAgeGroup(start1,end1);
    	     break;
       case 6:
    	    System.out.println("enter patient id to mark as recovery id");
    	    int id1=s.nextInt();
    	    di.markPatientRecoveryById(id1);
    	    break;
       case 7:
    	    System.out.println("enter patient id to delete");
    	    int id2=s.nextInt();
    	    di.deletePatientById(id2);
    	    break;
       default:
	        b=false;
	        break;
  
    	 }
           
       }
    }
    catch(Exception e) {
    	System.out.println(e);
    }
       
    }
}
