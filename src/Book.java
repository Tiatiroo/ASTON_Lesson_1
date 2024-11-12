public class Book {
    private int PublicationYear;
    private String author;
    private String name;
    private OrderStatus status;

    public Book(int publicationYear, String author, String name, OrderStatus status) {
        this.PublicationYear = publicationYear;
        this.author = author;
        this.name = name;
        this.status = status;
    }

    public Book() {
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        PublicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + "," + PublicationYear + " автора: " + author;
    }
}
