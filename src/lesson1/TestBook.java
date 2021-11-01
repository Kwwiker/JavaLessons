package lesson1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Math", 38);
        Book b2 = new Book("Russian lang");
        Book b3 = new Book();
        b3.setName("C++ Tutorial");
        b3.setNumOfPages(200);
        System.out.println(b1);
        System.out.println(b3);
        System.out.println(b2);
        b2.ripPage();
    }
}
