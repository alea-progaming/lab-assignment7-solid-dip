public class Student {
    public void interactWithResource(LibraryResource resource) {
        if (resource instanceof Borrowable) {
            Borrowable borrowable = (Borrowable) resource;
            borrowable.borrow();
            borrowable.returnResource();
        } else {
            resource.displayResourceDetails();
        }
    }
}