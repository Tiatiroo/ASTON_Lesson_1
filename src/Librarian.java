
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Librarian {
    private String name;
    private List<Reader> blackList;

    private List<Order> orderList;

    public Librarian(String name, List<Reader> blackList, List<Order> orderList) {
        this.name = name;
        this.blackList = blackList;
        this.orderList = orderList;
    }

    public Librarian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reader> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<Reader> blackList) {
        this.blackList = blackList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void addToBlackList(Reader reader) {
        if (blackList.contains(reader)) {
            System.out.println("Читатель " + reader + " уже в черном списке");
            return;
        }
        blackList.add(reader);
        System.out.println("Читатель " + reader + " добавлен в черный список");
    }

    public void deleteFromBlackList(Reader reader) {
        if (blackList.contains(reader)) {
            blackList.remove(reader);
            System.out.println("Читатель " + reader + " удален из черного списка");
            return;
        }
        System.out.println("Читателя " + reader + " нет в черном списке");
    }

    public void checkOrderList(Catalog catalog) {
        Iterator<Order> orderListIterator = orderList.iterator();
        while (orderList.iterator().hasNext()) {
            try {
                Order order = orderListIterator.next();
                if (blackList.contains(order.getReader())) {
                    System.out.println("Читатель " + order.getReader() + " в черном списке");
                    orderListIterator.remove();
                    return;
                }
                switch (order.getBook().getStatus()) {
                    case FREE:
                        order.getReader().addOrderedBooks(order.getBook());
                        order.getBook().setStatus(OrderStatus.ORDERED);
                        System.out.println("Книга " + order.getBook().toString() + " выдана " + order.getReader().toString());
                        break;
                    case UNDER_CONSIDERATION:
                        order.getReader().removeOrderedBooks(order.getBook());
                        order.getBook().setStatus(OrderStatus.FREE);
                        orderListIterator.remove();
                        System.out.println(order.getReader().toString() + " вернул книгу " + order.getBook().toString());
                        break;
                }
            } catch (NoSuchElementException e) {
                return;
            }
        }
    }
}
