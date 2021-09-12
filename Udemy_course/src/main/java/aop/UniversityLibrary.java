package aop;

import aop.aspects.Book;
import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    public void getBook(Book book) {
        System.out.println("Getting a book from UniversityLibrary " + book.getName());
    }

    public String returnBook() {
        System.out.println("Returning the book to UniversityLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Getting a magazine from UniversityLibrary");
    }
}
