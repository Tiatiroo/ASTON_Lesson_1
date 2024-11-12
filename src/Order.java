import java.util.Date;

public class Order {
    private Reader reader;
    private Date orderDate;
    private Book book;

    public Order(Reader reader, Date orderDate, Book book) {
        this.reader = reader;
        this.orderDate = orderDate;
        this.book = book;
    }

    public Order() {
    }


    public Order(Reader reader) {
        this.reader = reader;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Заказ " + reader.toString() + " от " + orderDate + " " + book.toString();
    }
}
