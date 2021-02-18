package Composition;

public class Book
{
    private String title;
    private Author author;
    private int pages;
    private double price;

    private Boolean available=false;
    public Boolean getAvailable() {return available;}
	public void setAvailable(Boolean available) {this.available = available;}
    public Book(Author author, String title, int pages, double price) { this.author = author; this.title = title; this.pages = pages; this.price = price; author.books.add(this); }

	public String ToString() { return "AUTOR: " + this.author.ToString() + " Nazev knihy: " + this.title.toString() + " " + this.pages + "Str. Cena: " + this.price; }
}





