import java.util.List;

public class Library {
    private List<Librarian> librarianList;
    private List<Reader> readerList;
    private Catalog catalog;

    public Library(List<Librarian> librarianList, List<Reader> readerList, Catalog catalog) {
        this.librarianList = librarianList;
        this.readerList = readerList;
        this.catalog = catalog;
    }

    public List<Librarian> getLibrarianList() {
        return librarianList;
    }

    public void setLibrarianList(List<Librarian> librarianList) {
        this.librarianList = librarianList;
    }

    public List<Reader> getReaderList() {
        return readerList;
    }

    public void setReaderList(List<Reader> readerList) {
        this.readerList = readerList;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public void librarianList() {
        for (Librarian librarian : librarianList) {
            System.out.println(librarian.getName());
        }
    }

    public void readerList() {
        for (Reader reader : readerList) {
            System.out.println(reader.getName());
        }
    }
}
