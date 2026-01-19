
/**
* This is my code! Its goal is to <give purpose of file here>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/


public class DVD extends Disc{
	//attriute
	protected String studio; 
	
	//consructor
	 /**
     * Constructor to initialize a DVD object with specified details.
     *
     * @param studio      The name of the studio or production company
     * @param releaseYear The year the DVD was released
     * @param title       The title of the DVD
     * @param price       The price of the DVD
     * @param NewOrUsed   The condition of the DVD (either "NEW" or "USED")
     */
	public DVD(String studio, int releaseYear, String title, double price, String NewOrUsed){
		super(releaseYear,title, price, NewOrUsed); 
		this.studio= studio;
	}

    /**
     * Overrides the toString method to provide a formatted string representation of the DVD,
     * including details from the Disc class and the studio.
     *
     * @return A string containing formatted details of the DVD, including the studio
     */

	@Override 
	public String toString(){
		return String.format(super.toString(), studio); 
	}	

}
