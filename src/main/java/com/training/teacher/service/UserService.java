package com.training.teacher.service;
import org.apache.catalina.User;

import java.util.List;
public interface UserService {
    public List<com.training.teacher.model.User> getAll();
    public User addUser(User user);
    public User updateUser(User user);
    public String deleteUser(Long id );
}
