package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Getting a book from UniversityLibrary");
        System.out.println("---------------------------------------");
    }

    public void returnBook() {
        System.out.println("Returning the book to UniversityLibrary");
        System.out.println("---------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Getting a magazine from UniversityLibrary");
        System.out.println("---------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Returning the magazine to UniversityLibrary");
        System.out.println("---------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Add the book to UniversityLibrary");
        System.out.println("---------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Add the magazine to UniversityLibrary");
        System.out.println("---------------------------------------");
    }
}
