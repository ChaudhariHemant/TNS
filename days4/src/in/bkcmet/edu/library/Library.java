package in.bkcmet.edu.library;
public class Library {
  public String libraryName;
  private long userId;
  String booksName;
  
  
  public void displayPublic() {
	  System.out.println("Libeary name: "+libraryName);
  }
  private void displayPrivate() {
	  System.out.println(" User id:"+userId);
  }
  void displayDafault() {
	  System.out.println("BooksName is"+booksName);
  }
  
}
