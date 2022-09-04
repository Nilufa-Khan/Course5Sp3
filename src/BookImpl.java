import java.util.*;

public class BookImpl {
    public static void main(String[] args) {
        List<Book> bookList =
                Arrays.asList(new Book("java","Rajiv",340,678634989L),
                        new Book("C++","jiv",540,67863498969L),
                        new Book("C","pjiv",673,6786349098L),
                        new Book("python","fajiv",900,6712654989L),
                        new Book("js","bajiv",678,6786210809L),
                        new Book("Ds","najiv",399,6781657689L),
                        new Book("Os","majiv",789,678248789L),
                        new Book("CN","oajiv",450,678633289L),
                        new Book("SQL","eajiv",396,67863889L),
                        new Book("DBMS","dajiv",840,675434989L)
                );
        for (Book val : bookList) {
            System.out.println(val);
        }




    }
    }
}
