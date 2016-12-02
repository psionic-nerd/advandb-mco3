package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {
	
	public static final String AREA_MARINDUQUE = "MARINDUQUE";
	public static final String AREA_PALAWAN = "PALAWAN";
	public static final String AREA_BOTH = "BOTH";
	
	public static final String BQUERY_TITLE1 = "Both Read Table";
	
	public static final String MQUERY_TITLE1 = "Marinduque Read Table";
	public static final String MQUERY_TITLE2 = "Marinduque Update Table 1";
	public static final String MQUERY_TITLE3 = "Marinduque Update Table 2";
	public static final String MQUERY_TITLE4 = "Marinduque Update Table 3";
	public static final String MQUERY_TITLE5 = "Marinduque Delete";
	/*public static final String MQUERY_TITLE6 = "Marinduque Increment 10";
	public static final String MQUERY_TITLE7 = "Marinduque Increment 20";
	public static final String MQUERY_TITLE8 = "Marinduque Increment 30";
	public static final String MQUERY_TITLE9 = "Marinduque Increment 40";
	public static final String MQUERY_TITLE0 = "Marinduque Increment 50";*/
	
	
	public static final String PQUERY_TITLE1 = "Palawan Read Table";    
	public static final String PQUERY_TITLE2 = "Palawan Update Table 1";
	public static final String PQUERY_TITLE3 = "Palawan Update Table 2";
	public static final String PQUERY_TITLE4 = "Palawan Update Table 3";
	public static final String PQUERY_TITLE5 = "Palawan Delete";  
	/*public static final String PQUERY_TITLE6 = "Palawan Increment 10";    
	public static final String PQUERY_TITLE7 = "Palawan Increment 20";
	public static final String PQUERY_TITLE8 = "Palawan Increment 30";
	public static final String PQUERY_TITLE9 = "Palawan Increment 40";
	public static final String PQUERY_TITLE0 = "Palawan Increment 50";*/
	
	public static final String BQUERY_1 = "SELECT count(*) from hpq_death ";
	
	public static final String MQUERY_1 = "SELECT * from hpq_death ";
	public static final String MQUERY_2 = "UPDATE hpq_death SET mdeadage = mdeadage + 10  ";
	public static final String MQUERY_3 = "UPDATE hpq_death SET mdeadage = mdeadage + 20  ";
	public static final String MQUERY_4 = "UPDATE hpq_death SET mdeadage = mdeadage + 30  ";
	public static final String MQUERY_5 = "DELETE FROM hpq_death";
	/*public static final String MQUERY_6 = "UPDATE hpq_death SET mdeadage = mdeadage + 10 ";
	public static final String MQUERY_7 = "UPDATE hpq_death SET mdeadage = mdeadage + 20 ";
	public static final String MQUERY_8 = "UPDATE hpq_death SET mdeadage = mdeadage + 30 ";
	public static final String MQUERY_9 = "UPDATE hpq_death SET mdeadage = mdeadage + 40 ";
	public static final String MQUERY_0 = "UPDATE hpq_death SET mdeadage = mdeadage + 50 ";*/
	
	public static final String PQUERY_1 = "SELECT * from hpq_death ";
	public static final String PQUERY_2 = "UPDATE hpq_death SET mdeadage = mdeadage + 10 ";
	public static final String PQUERY_3 = "UPDATE hpq_death SET mdeadage = mdeadage + 20 ";
	public static final String PQUERY_4 = "UPDATE hpq_death SET mdeadage = mdeadage + 30 ";
	public static final String PQUERY_5 = "DELETE FROM hpq_death";	
	/*public static final String PQUERY_6 = "UPDATE hpq_death SET mdeadage = mdeadage + 10 ";
	public static final String PQUERY_7 = "UPDATE hpq_death SET mdeadage = mdeadage + 20 ";
	public static final String PQUERY_8 = "UPDATE hpq_death SET mdeadage = mdeadage + 30 ";
	public static final String PQUERY_9 = "UPDATE hpq_death SET mdeadage = mdeadage + 40 ";
	public static final String PQUERY_0 = "UPDATE hpq_death SET mdeadage = mdeadage + 50 ";*/
	
	public static final ArrayList<String> BOTH_Q_TITLES =  new ArrayList<String>(Arrays.asList(
			BQUERY_TITLE1));
	
	public static final ArrayList<String> MARINDUQUE_Q_TITLES =  new ArrayList<String>(Arrays.asList(
			MQUERY_TITLE1, 
			MQUERY_TITLE2, 
			MQUERY_TITLE3, 
			MQUERY_TITLE4, 
			MQUERY_TITLE5));
	
	public static final ArrayList<String> PALAWAN_Q_TITLES =  new ArrayList<String>(Arrays.asList(
			PQUERY_TITLE1, 
			PQUERY_TITLE2, 
			PQUERY_TITLE3, 
			PQUERY_TITLE4, 
			PQUERY_TITLE5));

}
