package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Getting a book from UniversityLibrary");
    }

}
