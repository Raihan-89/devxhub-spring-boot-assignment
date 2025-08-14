package com.raihan.assignment.services;

import com.raihan.assignment.model.Users;
import com.raihan.assignment.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users addUser(Users user) throws Exception {
        if(userRepository.findByUsername(user.getUsername()) != null) {
            throw new Exception("User already exist");
        }

        Users newUser = new Users();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(encoder.encode(user.getPassword()));
        newUser.setRole(user.getRole());

        return userRepository.save(newUser);
    }
}
