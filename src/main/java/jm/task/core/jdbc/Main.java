package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("Nikolay", "Ivanov", (byte) 20);
        userService.saveUser("Petr", "Petrov", (byte) 30);
        userService.saveUser("Ivan", "Kotov", (byte) 25);
        userService.saveUser("Igor", "Titov", (byte) 18);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
