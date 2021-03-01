package service;

import model.user;

import java.util.List;

public interface userService {
    List<user> showAll();
    void save(user user);
    user findById(int id);
    user insertUser(user user);
    void updateUser(int id, user user);
    void removeById(int id);
    void findByName(String name);


    //showall , save , findByID, insert,update ,removeID,findByName

}
