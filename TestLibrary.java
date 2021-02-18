package Composition;

class TestLibrary
{
    public static void main(String[] args)
    {
        Author Bubik = new Author("Bubik", "Bubikovic",1977, 05, 11);
        Author Bubaka = new Author("Vladimir Vladimirovich", "Bubaka", 1974, 01, 18);
        Reader Ctenar1 = new Reader("Zdenek", "Vasnivy");
        Reader Ctenar2 = new Reader("Dominik", "Tichy");
        Book b1 = new Book(Bubik, "Zivot te nauci", 333, 210.50);
        Book b2 = new Book(Bubik, "Stan se programatorem", 7777, 23500);
        Book b3 = new Book(Bubaka, "Svet neni velky", 121, 320.70);
        Book b4 = new Book(Bubaka, "35 neni moc", 35, 820.70);
        Library KNIHOVNA = new Library();
        KNIHOVNA.addBook(b1);
        KNIHOVNA.addBook(b2);
        KNIHOVNA.addBook(b3);
        KNIHOVNA.addBook(b4);
        KNIHOVNA.ListAll();
        
        Ctenar1.borrowBook(b4);
        Ctenar2.borrowBook(b4);
        KNIHOVNA.ListAvailable();
        Ctenar1.listBorrowed();
        Bubik.ListBooks();
    }

}
