package com.nextLine.nextLine.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/users")


public class UsersController {



    private final UsersService usersService;
     @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping
    public List<Users> getUsers() {
        return usersService.getUsers();
    }

    public Users createUser(Users user) {

         return usersService.createUser(user);
    }
}
