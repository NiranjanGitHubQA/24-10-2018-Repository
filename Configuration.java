package com.AutomationPractice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Configuration {
	
	public static final String Dev_Org_UserName = "nmajhi+adsales@10kview.com";
	public static final String Dev_Org_Password = "ravi@concretio1";
	
	public static final String Migration_Org_UserName = "niranjan.adsales.migr@10kview.com";
	public static final String Migration_Password = "ravi@concretio1";
	
	public static final String Demo_Org_UserName = "";
	public static final String Demo_Password = "";
	
	 // Create object of SimpleDateFormat class and decide the format
	static DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	//get current date time with Date()
	static Date date = new Date();
	// Now format the date
	static String date1= dateFormat.format(date);
	
	public static final String AccountName="Acc_Test";
	public static final String OpportunityName="Oppo_Test";
	public static final String ProposalName="Proposal_Test";
	public static final String TemplateName="Temp_Test";

}
