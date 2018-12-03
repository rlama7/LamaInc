/**
 * StaffMember.java	  --A program to represent a generic staff member
 * @author    			Ratna Lama / King Arthur Alagao
 * @version   			1.0
 * @since     			11/25/2017
*/

abstract public class StaffMember implements Payable, Comparable {

	protected String name;
	protected String address;
	protected String phone;

	/**
	* Sets up the staff member's name, address and phone number
	* @param	name		staff member name	
	* @param	address		staff member address
	* @param	phone		staff member phone number
	*/
	public StaffMember(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	} // end StaffMember()

	/**
	* Returns a string including the basic employee information
	* @return 	result		the basic employee information
	*/
	public String toString() {
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		return result;
	} // end toString()

	/**
	* Declares an abstract method called vaction
	* Derived classes must define an abstract vacation method for 
	* each type of employee.
	* @return 	int 	the number of vacation days a person has
	*/
	public abstract int vacation();;

	/**
	* Compares this object with the specified object for order.
	* Returns a negative integer, zero, or a positive integer as 
	* this object is less than, equal to, or greater than the specified 
	* object.
	* @parm 	other 		specified object to be compared for order
	* @return 	result 		negative integer if this object is less than the specified object
	*						zero if this object is equal to specified object
	*						a positive integer if this object is greater than the specified object						
	*/
	public int compareTo(Object other) {
		int result;
		String otherName = ((StaffMember)other).getName();
		result = name.compareTo(otherName);
		return result;
	} // end compareTo()

	/**
	* Get accecssor provides read access to name field
	* @return 	name 	name of a staff member in the firm
	*/
	public String getName() {
		return name;
	} // end getName()

} // end StaffMember class