
/**
* This is my code! Its goal is to <define the audiobookse>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/


public class AudioBooks extends Books{
	//attributes
	protected String reader; 

	/**
     * Constructor for AudioBooks.
     *
     * @param author     The author of the book.
     * @param title      The title of the book.
     * @param price      The price of the book.
     * @param NewOrUsed  Indicates if the book is new or used.
     * @param reader     The name of the audiobook reader.
     */
	
       	public AudioBooks(String author, String title, double price, String NewOrUsed, String reader) {
		super(author, title, price, NewOrUsed);
		this.reader= reader; 
	}
 /**
     * Returns a string representation of the audiobook, including reader information.
     *
     * @return A string with book details and reader information.
     */

	@Override 
	public String toString(){
		return String.format(super.toString(), reader); 

	}	

}
