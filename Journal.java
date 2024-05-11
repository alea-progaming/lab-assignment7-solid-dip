public class Journal implements Borrowable {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public boolean borrow() {
        System.out.println("Journal '" + title + "' has been borrowed.");
        return true;
    }

    @Override
    public void returnResource() {
        System.out.println("Journal '" + title + "' has been returned.");
    }

    @Override
    public void displayResourceDetails() {
        System.out.println("Title: " + title);
    }
}