package lesson1;

public class Book {
    private int numOfPages;
    private String name;

    public Book(String n, int nop) {
        name = n;
        numOfPages = nop;
    }

    public Book(String n) {
        name = n;
        numOfPages = 100;
    }

    public Book() {
        name = "No name";
        numOfPages = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return this.name + " book contains " + this.numOfPages + " pages";
    }

    public void ripPage() {
        if (getNumOfPages() > 0) {
            setNumOfPages(getNumOfPages() - 1);
            System.out.println("There is "+getNumOfPages()+" pages in " + getName()+" book now");
        } else {
            System.out.println("You can't rip page, because they are not in " + getName()+" book");
        }
    }
}
