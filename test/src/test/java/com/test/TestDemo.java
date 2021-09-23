package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ThreadPoolExecutor;

@SpringBootTest
public class TestDemo {
    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;
    @Test
    public void test(){
        System.out.println("COREPOOLSIZE="+threadPoolExecutor.getPoolSize());
    }
}
