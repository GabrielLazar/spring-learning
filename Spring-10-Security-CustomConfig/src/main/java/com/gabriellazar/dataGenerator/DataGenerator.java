package com.gabriellazar.dataGenerator;

import com.gabriellazar.entity.User;
import com.gabriellazar.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class DataGenerator  implements CommandLineRunner {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;


    public DataGenerator(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.deleteAll();

        User employee = new User("gabi", passwordEncoder.encode("gabi123") ,1,"USER","");
        User admin = new User("admin",passwordEncoder.encode("admin"),1,"ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager",passwordEncoder.encode("manager123"),1,"MANAGER","ACCESS_TEST1");


        List<User> userList = Arrays.asList(employee,admin,manager);
        userRepository.saveAll(userList);
    }
}
