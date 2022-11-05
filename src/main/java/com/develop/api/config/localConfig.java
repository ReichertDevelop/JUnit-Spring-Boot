package com.develop.api.config;

import com.develop.api.domain.Users;
import com.develop.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class localConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        Users u1 = new Users(null, "Luiz", "develop@gmail.com", "123");
        Users u2 = new Users(null, "Luana", "luana@gmail.com", "123");

        List<Users> usersList = null;
        usersList.add(u1);
        usersList.add(u2);

        repository.saveAll(usersList);
    }
}
