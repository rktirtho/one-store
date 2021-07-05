package com.rktirthoh.onestore.dao;

import com.rktirthoh.onestore.entity.user.Token;
import com.rktirthoh.onestore.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class DbInit implements CommandLineRunner {

    @Autowired
    private  UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public void run(String... args) throws Exception {

//        userRepository.deleteAll();
//
//        User user1 = new User("rktirtho", passwordEncoder.encode("qwert"), "ADMIN", "ACCESS_API");
////        Token token = new Token(UUID.randomUUID().toString());
//        User user2 = new User("robi", passwordEncoder.encode("test"), "MANAGER", "ACCESS_API");
//        User user3 = new User("siam", passwordEncoder.encode("1234"), "MANAGER", "ACCESS_TEST2");
//        User user4 = new User("jisam1", passwordEncoder.encode("12345678"), "ADMIN", "ACCESS_TEST1");
//
//        List<User> userList = Arrays.asList(user1, user2, user3, user4);
//
//        userRepository.saveAll(userList);

    }
}
