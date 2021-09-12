package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Getting a book from UniversityLibrary");
    }

    public String returnBook() {
        System.out.println("Returning the book to UniversityLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Getting a magazine from UniversityLibrary");
    }
}
