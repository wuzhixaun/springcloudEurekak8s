package com.study.producer.aop;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 使用AOP方式对接口请求计数
 *
 * @Author 网易云课堂微专业-java高级开发工程师【allen老师】
 * @Version 1.0
 */
@Component
@Aspect
public class APICounterAop {

    ThreadLocal<Long> startTime = new ThreadLocal<>();
    @Autowired
    MeterRegistry registry;
    private Counter counter;

    @Pointcut("execution(public * com.study.producer.controller.*.*(..))")
    public void pointCut() {
    }

    @PostConstruct
    private void init() {
        counter = registry.counter("requests_total", "status", "success");
    }

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("do before");
        counter.increment(); //请求计数
    }

    @AfterReturning(returning = "returnVal", pointcut = "pointCut()")
    public void doAfterReturning(Object returnVal) {
        System.out.println("do after");
    }
}

