package com.ust.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.ust.services.ExplicitScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import(value= {ExplicitScan.class})
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }
}
