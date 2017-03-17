package pkgLibrary;

import java.util.ArrayList;
import pkgMain.XMLReader;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public static Book getBook (int cat_id, String book_id) throws BookException {
		Catalog cat = XMLReader.ReadXMLFile();
		try{
		for (Book b: cat.getBooks()){
			if(b.getId() == book_id){
				return(b);
			}
		}
			throw new BookException(cat,book_id);
			
		}catch (BookException e){
			throw e;
		}catch (Exception e){
			throw e;
		}
	}

	public static void addBook (int id, Book b) throws Exception{
		Catalog cat = XMLReader.ReadXMLFile();
		try{
			for(Book cat_book : cat.getBooks()){
				if (cat_book.getId() == b.getId())
					throw new BookException(cat,b);
				}
			}catch (BookException e){
				throw e;
				
			}catch (Exception e){
				throw e;
			}
		cat.getBooks().add(b);
		XMLReader.WriteXMLFile(cat);
	}
}

