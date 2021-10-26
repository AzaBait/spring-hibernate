package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    User getModelCar(String model);

    User getSeries(int series);

    User gerCarOwner(String model, int series);
}
