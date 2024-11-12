import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Name",new ArrayList<>(),new ArrayList<>());
        Catalog catalog = new Catalog(new ArrayList<>());
        Book book = new Book(2024,"Author","Name",OrderStatus.FREE);
        Book book1 = new Book(2024,"Author","Name",OrderStatus.ORDERED);
        Reader reader = new Reader("Name","Surname", new Date(),new ArrayList<>());

        List<Librarian> librarianList = new ArrayList<>();
        List<Reader> readerList = new ArrayList<>();
        librarianList.add(librarian);
        readerList.add(reader);
        catalog.addToCatalog(book);

        Library library = new Library(librarianList,readerList,catalog);

        reader.openOrder(book,catalog,librarian.getOrderList());
        librarian.checkOrderList(catalog);
        reader.closeOrder(book,reader.getOrderedBooks(),librarian.getOrderList());
        librarian.checkOrderList(catalog);

        reader.openOrder(book1,catalog,librarian.getOrderList());
        librarian.checkOrderList(catalog);

        librarian.addToBlackList(reader);
        reader.openOrder(book,catalog,librarian.getOrderList());
        librarian.checkOrderList(catalog);
        librarian.deleteFromBlackList(reader);


    }
}
