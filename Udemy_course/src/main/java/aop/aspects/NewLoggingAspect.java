package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public String aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice: Trying to return a book to the library");

        proceedingJoinPoint.proceed();

        System.out.println("aroundReturnBookLoggingAdvice: The book was successfully returned to the library");
    }
}
