/**
 * Hourly.java	  --A program to represent employee member 
 * 					who is paid hourly in a firm.
 * @author    		Ratna Lama / King Arthur Alagao
 * @version   		1.0
 * @since     		11/25/2017
*/

public class Hourly extends Employee implements Payable {

	private int hoursWorked;

	/**
	* Sets up basic information of an hourly paid employee
	* @parm 	name					name of an hourly paid employee
	* @parm 	address					address of an hourly paid employee
	* @parm 	phone					phone number of an hourly paid employee
	* @parm 	socialSecurityNumber	social security number of an hourly paid employee
	* @parm 	payRate					pay rate of an hourly paid employee
	*/
	public Hourly(String name, String address, String phone, 
		String socialSecurityNumber, double payRate) {

		super(name, address, phone, socialSecurityNumber, payRate);
		this. hoursWorked = 0;
	} // end Hourly()


	/**
	* Adds specified numbers of hours to employee's accumulated hours
	* @parm 	moreHours 	numbers of hours an employee has accumulated
	*/
	public void addHours(int moreHours) {
		hoursWorked += moreHours;
	} // end addHours()

	/**
	* Computes and returns the pay for an hourly employee
	* @return 	payment 	total payment to be paid to an hourly employee
	*/
	public double pay() {
		double payment = payRate * hoursWorked;
		hoursWorked = 0;	// Resets hours worked to zero after it has been awarded
		return payment;
	} // end pay()

	/**
	* Returns information about an hourly employee as a string
	* @return 	result 	the basic information about an hourly employee
	*/
	public String toString() {
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		return result;
	} // end toString()

	/**
	* Returns number of vacation days applicable to an hourly employee
	* @return 	number of vaction days applicable to an hourly employee
	*/
	public int vacation() {
		return (STANDARD_VACATION -7);
	} // end vacation()

} // end Hourly class