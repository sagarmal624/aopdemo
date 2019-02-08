package com.example.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class EmpAccessAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("test()")
    public void before(JoinPoint joinPoint) {
        //Advice
        logger.info(" Before executation of Employee Service methid........................");
        logger.info(" Allowed execution for {}", joinPoint);
    }
    @After("test()")
    public void after(JoinPoint joinPoint) {
        //Advice
        logger.info(" Before executation of Employee Service methid........................");
        logger.info(" Allowed execution for {}", joinPoint);
    }
    @Pointcut("execution(public * com.example.aopdemo.service.EmployeeService*.*(..))")
    public void test() {
        System.out.println("Logic goes here");
    }
//    @After("execution(* com.example.aopdemo.service.EmployeeService*.*(..))")
//    public void after(JoinPoint joinPoint) {
//        //Advice
//        logger.info(" After executation of Employee Service methid........................");
//        logger.info(" Allowed execution for {}", joinPoint);
//    }

    //    @Before("execution(* com.example.aopdemo.service.*.*(..))")
//    @Before("test()")
//    public void before(JoinPoint joinPoint) {
//        //Advice
//        logger.info(" Check for user access ");
//        logger.info(" Allowed execution for {}", joinPoint);
//    }

//    @After("execution(* com.example.aopdemo.service.*.*(..))")
//    public void after(JoinPoint joinPoint) {
//        //Advice
//        logger.info(" after executation");
//        logger.info(" Allowed execution for {}", joinPoint);
//    }

//    @Pointcut("execution(* com.example.aopdemo.service.EmployeeService.get())")
//    public void test() {
//    }
}
