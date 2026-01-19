iimport java.util.Scanner;  
import java.util.ArrayList; 
/**
* This is my code! Its goal is to <give purpose of file here>
* CS 312 - Assignment 4
* @author <Angela Tierney>
* @version <1.0 October 25th, 2024 >
*/

public class CLI {
	protected Inventory inventory; 
        protected Scanner scanner; 

	//constructor 
	public CLI(Inventory inventory){
		this.inventory= inventory; 
		this.scanner= new Scanner(System.in);
	}

	//prints the message to the user 

	public void printUsage(){
		System.out.println("Usage: java Driver [-d|-a|-s] <options>");
    		System.out.println("There are three command line options:");
    		System.out.println();
    		System.out.println("(display) -d [(everything by default) | -t \"title\" | -a \"author\" ]");
    		System.out.println();
    		System.out.println("(add) -a DVD \"title\" cost year \"studio\" [ NEW|USED ]");
    		System.out.println("(add) -a CD \"title\" cost year \"band\" [ NEW|USED ]");
    		System.out.println("(add) -a BOOK \"title\" cost author genre [ NEW|USED ]");
    		System.out.println("(add) -a AUDIOBOOK \"title\" cost author \"reader\" [ NEW|USED ]");
    		System.out.println();
    		System.out.println("(sell all) -s [-t title | -a author]");
	}

	

	/*parsing command line arguments*
 *Parses command-line arguments and performs various inventory operations based on the input.
*/
	public void command(String[] args){
		if(args.length==0){
			printUsage();
		}
		switch(args[0]){
			case "-d":
				System.out.println("Displaying");
				displayALL(args); 
				break; 
			case "-a": 
				System.out.println("adding");
				addInventory(args);
				break; 
			case "-s":
				System.out.println("sold");
				break; 
			default: 
				System.out.println("invalid command. please try again." );
				printUsage();
				break; 
		}
	
	}

	/*printUsage class to print error message*/	
	/**
 * displays item to the inventory based on command arguments.
 * If no additional arguments are provided, displays all items in inventory.

 *
 * @param args Command-line arguments containing item details.
 */
	//display method to be called in command method 
	public void displayALL(String[] args){
	       if(args.length==1){
		       inventory.display(); 
	       }

	       else if (args.length==3){
		       if("-t".equals(args[1])){
			       inventory.displayTitle(args[2]); 
		       }
		       else if("-a".equals(args[1])){
			       inventory.displayAuthor(args[2]);
		       }else {
			       System.out.println("invalid display option"); 
			       printUsage(); 
		       }

	       }
	       else{
		        System.out.println("invalid display option");
			printUsage();
	       }
	}
	
	public void addInventory(String[] args){
		/*check if the user is adding enough things about item to add it*/
	      if(args.length>6){
		       System.out.println("invalid number of arguments to add item"); 
		       printUsage(); 
		       return; 
	       }	       
		
	       //parsing the argument to get what type of item it is
	       String type= args[1].toUpperCase(); 

	       //to get the title 
	       String title= args[2]; 
	       //to get the price
	       double price= Double.parseDouble(args[3]);

	       /*need to do error check to see*/
	       try{
		       price= Double.parseDouble(args[3]);
	       }
	       catch(NumberFormatException e){
		       System.out.println("ERROR.Invalid input for price. Try again");
		       printUsage(); 
		       return; 
	       }

	       /*used or used*/
	       String condition = args[args.length - 1].toUpperCase(); 
	       //error check if the user input used or new as the last inout statement
	       if(!"NEW".equals(condition) &&!"USED".equals(condition)){
		      //System.out.println("invalid condition! only new or used!"); 
		      printUsage(); 
		      return; 
	       }

	        
	        
	       
	       Item item= null;

	       switch(type){
		       case "BOOK":
			       String author= args[4]; 
			       String genre= args[5]; 
			       item = new PrintBooks(title,author, price, genre, condition); 
			       break; 

		       case "AUDIOBOOK":
			      author= args[4]; 
			      String reader= args[5]; 
			      item = new AudioBooks(title, author, price, reader, condition); 
			      break; 
		       case "CD":
			      int year = Integer.parseInt(args[4]); 
			      String band= args[5]; 
			      item = new CD(title, year, band, price,condition); 
			      break; 
		       case "RECORD":
                              year = Integer.parseInt(args[3]);
                              band= args[4];
                              item = new CD(title, year, band, price,condition);
                              break;
		       case"DVD":
			      year= Integer.parseInt(args[4]); 
			      String studio= args[5]; 
			      item= new DVD(title, year, studio, price, condition); 
			      break; 
		       default:
			     System.out.println("invalid item type, try again"); 
			     printUsage(); 
			     return; 
	       }	
				       
	inventory.additem(item); 				       
	}
/**
 * Processes the sale of items based on title or author, as specified by command arguments.
 *
 * @param args Command-line arguments containing item information for sale.
 */

	public void sellItems(String[] args){
		/*error check if the length is less than 3*/
		if(args.length>3){
			System.out.println("invalid command for selling item"); 
			printUsage();
			return; 
		}	
		//either it will be -t or -a for the arg
		String aORt= args[1];
		String searching= args[2];

   		//Item itemSell= null; 

		if("-t".equals(aORt)){
			inventory.sellByTitle(searching); 
			inventory.display();

		}
		else if ("-a".equals(aORt)){
			inventory.sellByAuthor(searching); 
			inventory.display();
		}		
		else{
			System.out.println("invalid option");
			printUsage(); 
			return; 
		}



	} 

	public void readDatabase(BufferedReader reader) throws IOException{
                 String line;
                 if(!reader.ready()){
                         //System.out.println("provide input");
                         return;
                 }
                 for(line = reader.readLine(); line != null; line = reader.readLine()){
                         if (line.length() == 0){
                                 continue;   // ignore blank lines
                         }

                         else{
                                 System.out.println(line);
                                 String [] descriptors= line.split(";");

                                 addInventory(descriptors);
                         }
                 }
         }


}






