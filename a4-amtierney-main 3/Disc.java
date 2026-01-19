
/**
* This is my code! Its goal is to <give purpose of file here>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/

public class Disc extends Item{

	/*attributes*/
	private int releaseYear; 

	/*constructor*/
	public Disc(int releaseYear, String title, double price, String NewOrUsed){
		super(title, price, NewOrUsed);
		this.releaseYear= releaseYear;
	
	}

	@Override 
	public String toString(){
		return String.format(" %d, %s,%.2f, %s", releaseYear, title, price, NewOrUsed); 
	}

	@Override
	public boolean hasAuthor(){
		return false; 
	}
}

