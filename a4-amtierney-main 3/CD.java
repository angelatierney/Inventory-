
/**
* This is my code! Its goal is to <give purpose of file here>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/

public class CD extends Disc{
	//atribute
	protected String band;

	/**
     * Constructor for CD.
     *
     * @param band         The name of the band on the CD.
     * @param releaseYear  The release year of the CD.
     * @param title        The title of the CD.
     * @param price        The price of the CD.
     * @param NewOrUsed    Indicates if the CD is new or used.
     */
	public CD(String band,int releaseYear, String title, double price, String NewOrUsed){
		super(releaseYear,title,  price, NewOrUsed); 
		this.band= band;  
	}
	 /**
     * Returns a string representation of the CD, including band information.
     *
     * @return A string with disc details and band information.
     */
	@Override 
	public String toString(){
		return String.format(super.toString(),band); 

	}
}
