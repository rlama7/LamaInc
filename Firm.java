/**
 * Firm.java	  --A program to demonstrate polymorphism applying inheritance and interface.
 * @author    		Ratna Lama / King Arthur Alagao
 * @version   		1.0
 * @since     		11/25/2017
*/

public class Firm {

	/**
	* Creates employee for a firm and pays them
	* and sorts them alphabetically in descending order
	* @parm 	args 	the command-line arguments
	*/
	public static void main(String[] args) {
		
		Staff personnel = new Staff();	// Creates Staff personnel
		personnel.selectionSort(); 		// Sorts firm personnnel
		personnel.payday(); 		// Pays firm personnel

	} // end main() method

} // end Firm class