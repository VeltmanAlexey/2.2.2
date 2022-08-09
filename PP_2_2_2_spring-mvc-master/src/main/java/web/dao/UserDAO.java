package web.dao;

import web.Model.User;

import java.util.List;

public interface UserDAO {

    List<User> getUsers();

    User getById(int id);

    void save(User user);

    void update(int id, User newUser);

    void delete(int id);

}
