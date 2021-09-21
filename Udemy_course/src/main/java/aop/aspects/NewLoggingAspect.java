package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice: Trying to return a book to the library");

        Long begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();

        Long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: The book was successfully returned to the library");
        System.out.println("aroundReturnBookLoggingAdvice: Method returnBook did the job for " + (end - begin) + " milliseconds");

        return targetMethodResult;
    }
}
