/**
 * Volunteer.java	  --A program to represent a volunteer staff member.
 * @author    			Ratna Lama / King Arthur Alagaos
 * @version   			1.0
 * @since     			11/25/2017
*/

public class Volunteer extends StaffMember implements Payable {

	/**
	* Sets up the volunteer's name, address and the phone number
	* @param	name		name of the volunteer
	* @param	address		address of the volunteer
	* @param	phone		phone number of the volunteer 
	*/
	public Volunteer(String name, String address, String phone) {
		
		super(name, address, phone);	// Calls parent StaffMember's constructor
		
	} // end Volunteer()

	/**
	* Returns a zero pay for the volunteer staff member
	* @return 	0.0		pays zero to the volunteer staff member 
	*/
	public double pay() {
		return 0.0;		// Awards 0.0 pay to volunteers
	} // end pay()

	/**
	* Returns a zero vacation time for the volunteer staff members
	* @return 	0 		awards zero vacation days to volunteer staff members
	*/
	public int vacation() {
		return 0;  	// Awards 0 vacation to volunteers
	} // end vacation()

} // end Volunteer