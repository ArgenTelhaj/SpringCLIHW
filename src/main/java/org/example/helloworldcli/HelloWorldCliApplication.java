package org.example.helloworldcli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class HelloWorldCliApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldCliApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, World!");
    }
}
