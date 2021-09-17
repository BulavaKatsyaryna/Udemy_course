package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("aop.aspects.MyPointcut.allAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(): " + methodSignature.getName());

        System.out.println("beforeGetLoggingAdvice: logging attempts to get a book / magazine");
    }

//    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
//    private void allMetodFromUniversityLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniversityLibrary.returnMagazine())")
//    private void returnMagazineFromUniversityLibrary() {
//    }
//
//    @Pointcut("allMetodFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
//    private void allMethodExeptReturnMagazineFromUniversityLibrary() {
//    }
//
//    @Before("allMethodExeptReturnMagazineFromUniversityLibrary()")
//    public void beforeAllMethodExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodExceptReturnMagazineAdvice: writing Log #4");
//    }


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
}
