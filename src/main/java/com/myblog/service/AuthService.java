package com.myblog.service;

import com.myblog.dto.UserSignupRequest;
import com.myblog.model.User;
import com.myblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public void signUp(UserSignupRequest userSignupRequest) {
        User user = new User();
        user.setUserName(userSignupRequest.getUsername());
        user.setPassword(userSignupRequest.getPassword());
        user.setEmail(userSignupRequest.getEmail());
        userRepository.save(user);
    }
}
