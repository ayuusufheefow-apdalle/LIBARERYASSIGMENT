public class Main {
    public static void main(String[] args) {

        BookItem book = new BookItem("Java Programming", 3);
        DVDItem dvd = new DVDItem("Learning Java DVD", 2);

        System.out.println(" BOOK INFORMATION ");
        book.displayInfo();

        System.out.println();

        System.out.println("DVD INFORMATION");
        dvd.displayInfo();
    }
}