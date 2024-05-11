public class Audiobook implements LibraryResource {
    private String title;

    public Audiobook(String title) {
        this.title = title;
    }

    @Override
    public void displayResourceDetails() {
        System.out.println("Audiobook Title: " + title);
    }
}