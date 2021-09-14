package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
    private void allMetodFromUniversityLibrary() {
    }

    @Pointcut("execution(public void aop.UniversityLibrary.returnMagazine())")
    private void returnMagazineFromUniversityLibrary() {
    }

    @Pointcut("allMetodFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
    private void allMethodExeptReturnMagazineFromUniversityLibrary() {
    }

    @Before("allMethodExeptReturnMagazineFromUniversityLibrary()")
    public void beforeAllMethodExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodExceptReturnMagazineAdvice: writing Log #4");
    }

//          Комбинирование Pointcut

//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodFromUniversityLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodFromUniversityLibrary() {
//    }
//
//    @Pointcut("allGetMethodFromUniversityLibrary() || allReturnMethodFromUniversityLibrary()")
//    private void allGetAndReturnMethodFromUniversityLibrary() {
//    }
//
//    @Before("allGetMethodFromUniversityLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodFromUniversityLibrary()")
//    private void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLogging: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodFromUniversityLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }



//    @Pointcut("execution(* get*())")
//    private void allGetMethod() {
//    }
//
//    @Before("allGetMethod()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: trying to get a book/magazine");
//    }
//
//    @Before("allGetMethod()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: checking the rights to receive the book/magazine");
//    }
}
