public interface Borrowable extends LibraryResource {
    boolean borrow();
    void returnResource();
}