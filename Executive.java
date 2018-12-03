/**
 * Executive.java	  --A program to represent an executive employee member in a firm.
 * @author    			Ratna Lama / King Arthur Alagao
 * @version   			1.0
 * @since     			11/25/2017
*/

public class Executive extends Employee implements Payable {

	private double bonus;
	private int extraVacation;

	/**
	* Sets up an executive member's information
	* @parm 	name					name of an executive member in the firm
	* @parm 	address					address of an executive member in the firm	
	* @parm 	phone					phone number of an executive member in the firm
	* @parm 	socialSecurityNumber 	social security number of an executive member in the firm
	* @parm 	payRate 				pay rate of an executive member in the firm
	* @parm 	bonus 					bonus awarded to an executive member
	* @parm 	extraVacation 			extra vacation awarded to an executive member
	*/
	public Executive(String name, String address, String phone, 
		String socialSecurityNumber, double payRate, int extraVacation) {

		super(name, address, phone, socialSecurityNumber, payRate); 	// Calls parent Employee's constructor
		
		this.bonus = 0.0;	// Awards initial bonus to be zero
		this.extraVacation = extraVacation;
	} // end Executive() constructor

	/**
	* Awards the specified bonus to an executive in the firm
	* @parm 	execBonus 	bonus to be awarded to an executive 
	*/
	public void awardBonus(double execBonus) {
		bonus = execBonus;
	} // end awardBonus()

	/**
	* Pays an executive member
	* @return 	payment 	applies pay plus bonus to an executive member
	*/
	public double pay() {
		double payment = super.pay() + bonus;
		bonus = 0; 	// Resets bonus to zero after it has been awarded
		return payment;
	} // end pay()

	/**
	* Awards vaction days to an executive member
	* @return 	executiveVacation 	applies standard vacation plus extraVacation to an executive member
	*/
	public int vacation() {
		int executiveVacation = super.vacation() + extraVacation;
		extraVacation = 0;	// Resets extraVacation to zero after it has been awarded
		return executiveVacation;
	} // end vacation()

} // end Executive class
