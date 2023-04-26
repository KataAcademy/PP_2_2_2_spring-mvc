package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    User getUserById(int id);

    void addUser(User user);

    User updateUser(int id, User updatedUser);

    void deleteUser(int id);
}
