package com.demo.test.data.compatibility.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Component
    public class DBInitializer implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            UserEntity entity = new UserEntity();
            //entity.setId(UUID.randomUUID().toString());
            entity.setName("test user");
            UserEntity save = repository.save(entity);
        }
    }
}
