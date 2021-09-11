package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = ctx.getBean("libraryBean", Library.class);
        library.getBook();

        ctx.close();
    }
}
