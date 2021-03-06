package org.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ComponentScan
@Configuration
public class ThreadPoolConfiguration {
    @Bean
    @ConditionalOnClass(ThreadPoolExecutor.class)
    public ThreadPoolExecutor getThreadPool(){
        return  new ThreadPoolExecutor(10,10,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(100));
    }
}
