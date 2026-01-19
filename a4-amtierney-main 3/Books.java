
/**
* This is my code! Its goal is to <give purpose of file here>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/

public class Books extends Item{
	
	/*attributes*/
	String author; 

	
	/**
     * Constructor for Books.
     *
     * @param author     The author of the book.
     * @param title      The title of the book.
     * @param price      The price of the book.
     * @param NewOrUsed  Indicates if the book is new or used.
     */

	public Books(String author, String title, double price, String NewOrUsed){
		super(title, price, NewOrUsed);
		this.author= author;
	}
	
    /**
     * Returns a string representation of the book, including its type, author, title, price, and condition.
     *
     * @return A formatted string with book details.
     */
	@Override
        public String toString(){

                return String.format("%s, BOOK;  %s,  %.2f,  %s", this.author, this.title, this.price, this.NewOrUsed);
        }
	/**
     * Returns the author of the book.
     *
     * @param author The author's name.
     * @return The author's name.
     */
	public String getAuthor(String author){
		return author; 
	}
	/**
     * Indicates that this item has an author, specific to books.
     *
     * @return true, as all books have an author.
     */
    @Override
	@Override
	public boolean hasAuthor(){
		return true; 
	}	
	

}
