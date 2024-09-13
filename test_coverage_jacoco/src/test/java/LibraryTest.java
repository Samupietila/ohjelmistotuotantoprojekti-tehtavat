
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import test_coverage_jacoco.Library;

public class LibraryTest {

    @Test
    public void testAddAndListBooks() {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        List<String> books = library.listBooks();
        assertEquals("There should be 1 book in the library", books.size(), 1);
        assertEquals("The Great Gatsby", books.get(0), "The Great Gatsby");
        System.out.println(library.listBooks());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook("1984");
        library.removeBook("1984");
        List<String> books = library.listBooks();
        assertEquals("There should be no books in the library", books.size(), 0);
        System.out.println(library.listBooks());
    }
}
