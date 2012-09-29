
public class matchInputs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Please enter an action. Thanks!");
		} 
		else {
			for(String action: args){
				if(action.equals("for-each")){
					System.out.println("Matched: "+action);
				} //end of if
				else if (action.equals("for")){
					System.out.println("Matched: "+action);
				} //end of else if
				else if(action.equals("while")){
						System.out.println("Matched: "+action);
			    } //end of else if
				else {
					System.out.println("Not Match found for "+action);
				} //end of else
				
			} //end of for
		 } //end of else
	} //end of main
} // end of class