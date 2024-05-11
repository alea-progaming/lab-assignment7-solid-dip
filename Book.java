public class Book implements Borrowable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public boolean borrow() {
        System.out.println("Book '" + title + "' has been borrowed.");
        return true;
    }

    @Override
    public void returnResource() {
        System.out.println("Book '" + title + "' has been returned.");
    }

    @Override
    public void displayResourceDetails() {
        System.out.println("Title: " + title);
    }
}