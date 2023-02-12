package com.SpringWorkout.WebAppWork;

import com.SpringWorkout.WebAppWork.user.User;
import com.SpringWorkout.WebAppWork.user.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired private UserRepository repository;
    @Test
    public void testAddNew(){
        User user = new User();
        user.setEmail("Chungus@gmail.com");
        user.setPassword("chunguss123");
        user.setFirstName("Chung");
        user.setLastName("Gus");

        User savedUser = repository.save(user);
    }

    @Test
    public void testListAll(){
        Iterable<User> users = repository.findAll();
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void testUpdate(){
        Integer userId = 1;
        Optional<User> optionalUser = repository.findById(userId);
        User user = optionalUser.get();
        user.setPassword("Hello1232");
        repository.save(user);

        User updatedUser = repository.findById(userId).get();
    }
}
