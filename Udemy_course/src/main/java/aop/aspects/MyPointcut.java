package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {

    @Pointcut("execution(* abc*(..))")
    public void allAddMethod() {
    }
}
