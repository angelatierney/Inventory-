import java.util.List; 
import java.util.ArrayList;  
/**
* This is my code! Its goal is to <give purpose of file here>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/


public class Inventory{
	//has a relationship with item class
	//list 
	
	List<Item>items= new ArrayList<>();

	//constructor
	
	public Inventory(){
		items = new ArrayList<>(); 
	}

	//methods 
	 /**
     * Adds an item to the inventory.
     *
     * @param item The item to add to the inventory
     */
	public void additem(Item item){
		items.add(item);

	}

    /**
     * Displays all items currently in inventory. Prints a message if the inventory is empty.
     */
	
	public void display(){ 
		System.out.println("current items in inventory: " +items.size()); 
		if(items.isEmpty()){
			System.out.println("inventory is empty");
		}
		else{
			for(Item currentItem: items){
				System.out.println(currentItem);
			}
		}

	}

	public void displayTitle(String title){
		for (Item item: items){
			if(item.title.equals(title)){
				System.out.println(item); 
			}
		}

	}
 /**
     * Displays items with a specific title.
     *
     * @param title The title of items to display
     */
	public void  displayAuthor(String author){
		for(Item item: items){
			if(item instanceof Books){
				Books mybook= (Books) item; 
				if(mybook.hasAuthor()){
					System.out.println(mybook.getAuthor(author)); 
				}
			}
		}
	
	}
		
/**
     * Displays items by a specific author. Only applicable to items that are of type Books.
     *
     * @param author The author of items to display
     */

	public void sellByAuthor(String author){
		/*create a temp list*/
		List<Books>temp = new ArrayList<>(); 
	 	/*this is holding objects with type Book*/
		/*specifically only holdng book objects*/ 

		for(Item item: items){
			if(item instanceof Books){
				/*if the item(object)  is an instance of Books (type)  
				 * downcast the item to book 
				 */
				Books bookbook= (Books) item; 
				if(bookbook.hasAuthor()){
					temp.add(bookbook); 
				}
			}
		}	
		//remove all from the temp list 
		items.removeAll(temp); 
	}
 /**
     * Sells (removes) all items by a specified author from the inventory.
     *
     * @param author The author of books to be removed
     */
	public void sellByTitle(String title){
		/*make temp list to hold item that will be sold*/
		List<Item> sold= new ArrayList<>(); 
		/*need to loop through*/
		
		for (Item item: items){
			if(item.getTitle(title).equals(title)){
				sold.add(item); 
			}

		}
		items.removeAll(sold);
		

	}


}



