
public class MatchFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Please enter an action or actions. Thanks!");
		} //end of if
		else {
			String[] values = new String[args.length-1];
			for(int i=1; i<args.length;i++){
				//System.out.println("The "+i+"th value of inputs is "+args[i]);
				values[i-1] = args[i];
			} // end of for
			for(int idx=0;idx<values.length;idx++){
				if(values[idx].equals("foreach")){
					testForEach(values[idx]);
				} // end of if
				else if(values[idx].equals("for")){
					testFor(values[idx]);
				} //end of else if
				else if(values[idx].equals("while")){
					testWhile(values[idx]);
				} //end of else if
				else{
					NoMatch(values[idx]);
				}
				
			}//end of for
		} // end of else
		
	} //end of main
	
	static void testForEach(String arg) {
		System.out.println("Testing: testForeach=>Matched: "+arg+".");
	} //end of testForEach
	static void testFor(String arg) {
		System.out.println("Testing: testFor=>Matched: "+arg+".");
	} //end of testFor
	static void testWhile(String arg) {
		System.out.println("Testing: testWhile=>Matched: "+arg+".");
	} //end of testWhile
	static void NoMatch(String arg) {
		System.out.println("Not match found for "+arg+".");
	} //end of testWhile

} //end of class
