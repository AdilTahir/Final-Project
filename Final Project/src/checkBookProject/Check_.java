package checkBookProject;

public class Check_ {

	public static double checkAmount = 0.0; //amount the check is for
	public static int checkNumber; //to hold the check number 
	public static String checkPayee =  null; 
	public static String checkReason =  null;
	public static String checkPayer =  null;
	
    
    public Check_(double amount, String reason, String payee){
       //initialize the check's values
       Check_.checkAmount= amount; 
       Check_.checkNumber = 0;
       Check_.checkPayee = payee;
       Check_.checkReason = reason;
       Check_.checkPayer = "Mike Bell";// i know its overcoded, left this hardcode in but could swap for variable later
       
       
	}//Check_()
    
    public static void setAmount(Double inc){
    	checkAmount = inc;
    }
    
    public static void setPayee (String inc){
    	checkPayee = inc;
    }
    public static void setReason (String inc){
    	checkReason = inc;
    }
    
    public static void printCheck(){
    	System.out.println(Check_.checkPayer + "    " + Check_.checkNumber);
        System.out.println("Pay to the order of: " + Check_.checkPayee + "     " + Check_.checkAmount);
        System.out.println("For: " + Check_.checkReason);
    }//printCheck()
    
}//Class Check_