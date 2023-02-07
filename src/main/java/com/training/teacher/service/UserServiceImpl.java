package com.training.teacher.service;
import com.training.teacher.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<com.training.teacher.model.User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {

        return user;
    }

    @Override
    public User updateUser(User user) {
        return user;
    }

    @Override
    public String deleteUser(Long id) {
        return null;
    }
}
