package aop.aspects;

import aop.MyConfig;
import aop.UniversityLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = ctx.getBean("universityLibrary", UniversityLibrary.class);
        String bookName = universityLibrary.returnBook();
        System.out.println("The book was returned to the library: " + bookName);

        ctx.close();
        System.out.println("Method main ends");
    }
}