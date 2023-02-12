package com.SpringWorkout.WebAppWork;

import com.SpringWorkout.WebAppWork.user.User;
import com.SpringWorkout.WebAppWork.user.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;


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
}
