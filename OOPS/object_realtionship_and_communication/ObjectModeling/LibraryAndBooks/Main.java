public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Author A");
        Book b2 = new Book("Advanced Java", "Author B");
        Library lib1 = new Library();
        Library lib2 = new Library();
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b1);
        System.out.println("Library 1:");
        lib1.showBooks();
        System.out.println("Library 2:");
        lib2.showBooks();
    }
}
