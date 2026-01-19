OOD 


Iteration 1
CLASSES AND OBJECTS
Item- abstract class 
- all items inherit from this class 
Inventory- has a relationship with Item class 
- this is where the inventory list is made 
- the list holds whats in inventory 
- this class has the methods that sell/display/add items 
Books - extends Item class 
- holds attribute that AudioBook and PrintBook share 
Dic- extends from Item class 
- holds attribute that the CD and DVD share 
AudioBook- extends from Books class
- holds the reader of the book 
PrintBook- extends Books 
- holds genre  of the book
DVD - extends Disc class 
- holds the studio 
CD - extends Disc 
- hold the band 

SERVICES 
- additem: adds items to the list 
- displayall: displays all the items in the list 
- displaytitle: displays the certain title of an item 
- displayAuthor: displays the author of the item in disc or book class 
- sellbyauthor: remove item from the list by that author 
- selbytitle: remove item from the list by that title 
- hasAuthor: will return true if the item has an author(book class) and return false if the item does not(Disc class) 

INHERITANCE/DELEGATION 
- Item is the abstract class 
- Books and Disc extend from Item 
- Inventory has a relationship with item 
- AudioBook and PrintBook extends Books 
- DVD and CD extends Disc 

Iteration 2
Class 1: Item(abstract class)  
ATTRIBUTES: protected since are used in subclasses of Item class 
- protected String title 
- protected String price 
- protected boolean NewOrUsed
SERVICES 
Constructor- to initialize the objects 
- param: title 
- param: price 
- param: NewOrUsed 
hasAuthor- used to return true or false and ment to be overrided in Disc or Book 

Class 2: Inventory
ATTRIBUTES 
- List<Item>Inventory- to list the items for inventory 
SERVICES 
- void displayall: displays all the items in the list, no return 
- void displaytitle: displays the certain title of an item, no return
- void displayAuthor: displays the author of the item in disc or book class, no return
- void sellbyauthor: remove item from the list by that author, no return
- void selbytitle: remove item from the list by that title, no return

Class 3: Books( extends from Item class) 
ATTRIBUTES 
- author
- title/price/NewOrUsed super 
SERVICES 
override hasAuthor method 
- will return true since the book class has an author 

Class 4: Disc(extends from Item class)
ATTRIBUTES
- releaseyear
- title/price/NewOrUsed super
SERVICES
override hasAuthor method
- will return false since Disc class does not have an author 

Class 5: PrintBook(extends book class) 
ATTRIBUTES
- genre of the book 
SERVICES 
Constructor- to initialize the genre of the book 

Class 6 : PrintBook(extends book class)
ATTRIBUTES
- reader of the book
SERVICES
Constructor- initialize the reader 

Class 7 : DVD(extends Disc class)
ATTRIBUTES
- studio of DVD
SERVICES
Constructor- initialize the studio 

Class 8 : CD (extends Disc class)
ATTRIBUTES
- studio of CD
SERVICES
Constructor- initialize the band





