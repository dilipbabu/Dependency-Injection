package com.revature;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    public void save() {
        System.out.println("Saving user...");
    }
}
