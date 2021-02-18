package Composition;

import java.util.ArrayList;
import java.util.Date;

public class Author
{
    private String firstName;
    private String lastName;
    ArrayList <Book> books=new ArrayList<Book>();
    private MyDate dateOfBirth;

    public Author(String name, String lastname,int year, int month, int day) { this.firstName = name;this.lastName = lastname;this.dateOfBirth=new MyDate(year,month,day); }
    public Author(String name, String lastname) { firstName = name; lastName = lastname;}
    public void ListBooks() {for(int i=0;i<books.size();i++) {System.out.println(((Book)books.get(i)).ToString());}}
    public String ToString() { return this.firstName + " " + this.lastName+" Nar: "+this.dateOfBirth.ToString(); }

}
