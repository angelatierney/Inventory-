
/**
* This is my code! Its goal is to <give purpose of file here>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/

public class PrintBooks extends Books{
	/*attributes*/ 

	protected String genre; 
	/*constructor*/ 
	public PrintBooks(String author, String title, double price, String NewOrUsed,String genre){
		super(author, title, price, NewOrUsed);
		this.genre= genre; 
	}
	@Override 
	public String toString(){
		return String.format(super.toString(), genre); 

	}


}
