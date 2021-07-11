package classobjectexample;

public class Accountholderobjects {
	
	
   public static void main (String[] args) {
	   
   
   AccountHolder obj1=new AccountHolder();
   AccountHolder obj2=new AccountHolder();
   AccountHolder obj3=new AccountHolder();
   
   obj1.fname="Pranith";
   obj1.lname="Kondapalli";
   obj1.age=26;
   obj1.balance=20000;
   obj1.iseligibleforcreditcard();
   System.out.println("Is pranith eligbile for creditcard:" +obj1.eligibleforcreditcard);
   
   
   obj2.fname="Prashanth";
   obj2.lname="Eswarapu";
   obj2.age=29;
   obj2.balance=30000;
   obj2.iseligibleforcreditcard();
   System.out.println("Is Prashanth eligbile for creditcard:" +obj2.eligibleforcreditcard);
   

   obj3.fname="Venky";
   obj3.lname="Bandam";
   obj3.age=19;
   obj3.balance=4000;
   obj3.iseligibleforcreditcard();
   System.out.println("Is Venky eligbile for creditcard:" +obj2.eligibleforcreditcard);
   
  
   
  
   }
   

}
