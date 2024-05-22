package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
        
            // Retrieving the UserService bean from the context
            UserService userService = context.getBean(UserService.class);
            
            // Using the UserService bean
            userService.performService();
        
        }
    }
}
