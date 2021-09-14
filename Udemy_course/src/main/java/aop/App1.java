package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = ctx.getBean("universityLibrary", UniversityLibrary.class);
//        Book book = ctx.getBean("book", Book.class);

        universityLibrary.getBook();
        universityLibrary.returnBook();
        universityLibrary.getMagazine();
        universityLibrary.addBook();

//        SchoolLibrary schoolLibrary = ctx.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        ctx.close();
    }
}
