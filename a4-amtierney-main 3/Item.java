
/**
* This is my code! Its goal is to <give purpose of file here>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/


public abstract class Item{
	/*attributes*/ 
	protected String title; 
	protected double price; 
	protected String NewOrUsed; 

	/*constructor*
	 * @param title: title of item
	 * @param price- price of item
	 * @param new or used- item is either new or used*/
	public Item(String title, double price, String NewOrUsed){
		this.title= title;
		this.price= price; 
		this.NewOrUsed= NewOrUsed; 

		 
	}



	//change name 
	 /**
     * Retrieves the title of the item.
     *
     * @param title The title to retrieve
     * @return The title of the item
     */
	public String getTitle(String title){
		return title; 
	}
	 /**
     * Abstract method to return a string representation of the item.
     * Each subclass must implement this method to provide specific details for the item type.
     */

	public abstract String toString(); 
  /**
     * Abstract method to check if an item has an author.
     * 
     * @return true if the item has an author (e.g., Books), false otherwise (e.g., CD or DVD).
     * This method will be implemented in subclasses as needed.
     */
	public abstract boolean hasAuthor(); 
	//overrided by the subclasses to return 
		//returns true if it has an author(book) 
		//return false if it does not have an author (disco)  
		
	

}

