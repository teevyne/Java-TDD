package test;

import main.BookShelf;
import org.junit.jupiter.api.DisplayName;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import static org.junit.Assert.assertTrue;

@DisplayName(" <= Bookshelf=>")
public class BookShelfTest {

    Logger logger = Logger.getLogger(getClass().getName());

    private BookShelfTest(TestInfo testInfo){
        System.out.println("Working on test class " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("is empty when no book is added to it")
    public void shelfEmptyWhenNoBookAddedTest(TestInfo testInfo) throws Exception {
        System.out.println("Working on test " + testInfo.getDisplayName());
        BookShelf bookShelf = new BookShelf();
        List<String> books = bookShelf.books();
        logger.info("Bookshelf is empty");
        assertTrue(books.isEmpty());
    }

//    @Test
//    public void shelfToStringShouldPrintBookCountAndTitles() throws Exception {
//        BookShelf shelf = new BookShelf();
//        List<String> books = shelf.books();
//        books.add("The Phoenix Project");
//        books.add("Java 8 in Action");
//        String shelfStr = shelf.toString();
//        assertTrue(shelfStr.contains("The Phoenix Project"),  "1st book title missing");
//        assertTrue(shelfStr.contains("Java 8 in Action") , "2nd book title missing ");
//        assertTrue(shelfStr.contains("2 books found"), "Book  count missing");
//    }
}
