public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();


        Book book = new Book("Effective Java");
        Journal journal = new Journal("Nature");


        Audiobook audiobook = new Audiobook("Becoming");
        EJournal eJournal = new EJournal("Latest Science");


        student.interactWithResource(book);
        student.interactWithResource(journal);


        student.interactWithResource(audiobook);
        student.interactWithResource(eJournal);
    }
}