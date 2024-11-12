import java.util.List;

public class Catalog {
    private List<Book> books;

    public Catalog(List<Book> books) {
        this.books = books;
    }

    public Catalog() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addToCatalog(Book book) {
        books.add(book);
        System.out.println("Книга " + book.toString() + " добавлена");
    }

    public void deleteFromCatalog(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Книга " + book.toString() + " удалена");
            return;
        }
        System.out.println("Книги " + book.toString() + " в каталоге нет");
    }

    public boolean isInCatalog(Book book) {
        return books.contains(book);
    }

    public void catalogList() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }


}
