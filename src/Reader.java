import java.util.Date;
import java.util.List;

public class Reader {
    private String name;
    private String surname;

    private Date registrationDate;
    private List<Book> orderedBooks;

    public Reader(String name, String surname, Date registrationDate, List<Book> orderedBooks) {
        this.name = name;
        this.surname = surname;
        this.registrationDate = registrationDate;
        this.orderedBooks = orderedBooks;
    }

    public Reader() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Book> getOrderedBooks() {
        return orderedBooks;
    }

    public void setOrderedBooks(List<Book> orderedBooks) {
        this.orderedBooks = orderedBooks;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public void addOrderedBooks(Book book) {
        orderedBooks.add(book);
    }

    public void removeOrderedBooks(Book book) {
        orderedBooks.remove(book);
    }

    public void openOrder(Book book, Catalog catalog, List<Order> orderList) {
        if (catalog.isInCatalog(book) && (book.getStatus() == OrderStatus.FREE)) {
            orderList.add(new Order(this, new Date(), book));
            return;
        }
        System.out.println("Книги " + book.toString() + " в данный момент в каталоге нет");
    }

    public void closeOrder(Book book, List<Book> orderedBooks, List<Order> orderList) {
        if (orderedBooks.contains(book)) {
            book.setStatus(OrderStatus.UNDER_CONSIDERATION);
            return;
        }
        System.out.println("Книги " + book.toString() + " в заявках нет");
    }

}
