package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Getting a book from UniversityLibrary");
    }

    public void returnBook() {
        System.out.println("Returning the book to UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("Getting a magazine from UniversityLibrary");
    }

    public void returnMagazine() {
        System.out.println("Returning the magazine to UniversityLibrary");
    }

    public void addBook() {
        System.out.println("Add the book to UniversityLibrary");
    }

    public void addMagazine() {
        System.out.println("Add the magazine to UniversityLibrary");
    }
}
