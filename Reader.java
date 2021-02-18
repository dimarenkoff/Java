package Composition;

import java.util.ArrayList;

public class Reader
{
    private String firstName;
    private String lastName; 
    public Reader(String name, String lastname) { this.firstName = name;this.lastName = lastname; }
    private ArrayList<Book> myBooks = new ArrayList<Book>();
    public void borrowBook(Book b) { if (b.getAvailable() == true) { this.myBooks.add(b);b.setAvailable(false); } else System.out.println("Book is not available(Borrowed by someone)"); }
    public void returnBook(Book b) { if (b.getAvailable() != true) this.myBooks.remove(b); }
    public void listBorrowed() {for(int i=0;i<myBooks.size();i++) {System.out.println(((Book)myBooks.get(i)).ToString());}}
}
