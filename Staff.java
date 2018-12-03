/**
 * Staff.java	  --A program to represent the personnel staff member in a firm.
 * @author    		Ratna Lama / King Arthur Alagao
 * @version   		1.0
 * @since     		11/25/2017
*/

public class Staff {
	
	private StaffMember[] staffList;

	/**
	* Sets up the list of Staff members
	*/
	public Staff() {
		staffList = new StaffMember[6];

		staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07, 12);
		staffList[1] = new Employee("Carla", "456 Sunset Blvd", "555-0101", "973-45-1239", 1246.15);
		staffList[2] = new Employee("Woody", "789 Rockrose Lane", "555-0000", "020-30-3040", 1169.23);
		staffList[3] = new Hourly("Diane", "324 Fifth Ave", "555-0690", "958-47-3625", 10.55);
		staffList[4] = new Volunteer("Norm", "983 Sunrise Blvd", "555-8374");
		staffList[5] = new Volunteer("Cliff", "331 Harrison St", "555-7234");

		((Executive)staffList[0]).awardBonus(500.00); 	// Awards bonus to executive member 

		((Hourly)staffList[3]).addHours(40); 	// Awards hours to hourly staff member

	}// end Staff() constructor

	/**
	* Pays all Staff members
	*/
	public void payday() {
		double amount;
		int vacationDays;

		for(int count=0; count<staffList.length; count++) {
			System.out.println(staffList[count]);
			amount = staffList[count].pay();	// polymorphic

			if(amount ==0.0) {
				System.out.println("Thanks!");
			}else {
				System.out.println("Paid: " + amount);
			}
			vacationDays = staffList[count].vacation();
			System.out.println("Vacation days available: " + vacationDays);
			System.out.println("---------------------------------------");
		} // end for loop

	} // end payday()

	/**
	* Sorts the specified array of objects using the selection 
	* sort algorithm.
	*/
	public void selectionSort() {
		int index, scan, min;
		StaffMember temp;

		for(index = 0; index < staffList.length-1; index++){
			min = index;
			for(scan = index+1; scan < staffList.length; scan++){
				if((staffList[scan]).compareTo(staffList[min]) > 0){
					min = scan;		
				}	
			}

			/**
			* Swaps the values
			*/
			temp = staffList[min];
			staffList[min] = staffList[index];
			staffList[index] = temp;
		} // end for loop		
	} // end selectionSort()

} // end Staff class