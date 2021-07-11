package classobjectexample;

public class AccountHolder {
	
	String fname;
	String lname;
	int age;
	float balance;
	boolean eligibleforcreditcard;
	
	public void iseligibleforcreditcard() {
		
		if (age>25 && balance>25000) {
			eligibleforcreditcard=true;
		}
		else {
			eligibleforcreditcard=false;
			
	}
	
	
}
}
