/**
 * Employee.java	  --A program to represent a general paid employee member in a firm.
 * @author    			Ratna Lama / King Arthur Alagao
 * @version   			1.0
 * @since     			11/25/2017
*/

public class Employee extends StaffMember implements Payable {

	protected String socialSecurityNumber;
	protected double payRate;
	protected int STANDARD_VACATION = 14;

	/**
	* Sets up the name, address, phone number, social security number,
	* and pay rate of an employee.
	* @parm 	name					name of employee
	* @parm 	address					address of employee
	* @parm 	phone					phone number of employee
	* @parm 	socialSecurityNumber	social security number of employee	
	* @parm 	payRate					pay rate of employee
	* @parm 	STANDARD_VACATION 		the number of vacation days a person in a firm has
	*/
	public Employee(String name, String address, String phone, 
		String socialSecurityNumber, double payRate) {

		super(name, address, phone);
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
		this.STANDARD_VACATION = STANDARD_VACATION;
	} // end Employee()

	/**
	* Returns information about an employee as a string
	* @return 	result 	the basic employee information
	*/
	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	} // end toString()

	/**
	* Returns the pay rate for the paid employee
	* @return 	payRate		the rate at which each paid employee is compensated.
	*/
	public double pay() {
		return payRate;
	} // end pay()

	/**
	* Returns the number of days a person has vacation in a firm.
	* @return 		STANDARD_VACTION 	the number of days a person has vacation in a firm
	*/
	public int vacation() {
		return STANDARD_VACATION;
	} // end vacation()

} // end Employee