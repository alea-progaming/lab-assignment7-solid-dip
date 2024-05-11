public class EJournal implements LibraryResource {
    private String title;

    public EJournal(String title) {
        this.title = title;
    }

    @Override
    public void displayResourceDetails() {
        System.out.println("Ejournal Title: " + title);
    }
}