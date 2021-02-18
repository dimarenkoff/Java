package Composition;

import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books=new ArrayList<Book>();
    
    public void addBook(Book b) { this.books.add(b);b.setAvailable(true); }
    public void ListAvailable() {for(int i=0;i<books.size();i++) {Boolean OK=(Boolean)books.get(i).getAvailable();if(OK=true){System.out.println(((Book)books.get(i)).ToString());}}}   
    public void ListUnavailable() {for(int i=0;i<books.size();i++) {Boolean OK=(Boolean)books.get(i).getAvailable();if(OK!=true){System.out.println(((Book)books.get(i)).ToString());}}}   
    public void ListAll() { System.out.println("Volne knihy:"); for(int i=0;i<books.size();i++) {System.out.println(((Book)books.get(i)).ToString());}}
}
