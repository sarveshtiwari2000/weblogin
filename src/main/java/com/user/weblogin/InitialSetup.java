package com.user.weblogin;

import com.user.weblogin.model.RoleNames;
import com.user.weblogin.model.User;
import com.user.weblogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitialSetup {

    @Autowired
    private UserService userService;

    @Value("${admin.first.name}")
    private String firstName;

    @Value("${admin.last.name}")
    private String lastName;

    @Value("${admin.email.address}")
    private String emailAddress;

    @Value("${admin.password}")
    private String password;



    @PostConstruct
    public void initIt() throws Exception {

        User dbUser = userService.findUserByEmail(emailAddress);

        if (dbUser == null) {
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(emailAddress);
            user.setPassword(password);
            user.setActive(Boolean.TRUE);
            user.setRoleName(RoleNames.ADMIN.name());
            userService.saveUser(user);
        }
        loadUsers();
    }



    private void loadUsers() {
        User user1 = new User("admin1", "admin1",
                "admin1@admin1.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user1);

        User user2 = new User("admin2", "admin2",
                "admin2@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user2);

        User user3 = new User("admin3", "admin3",
                "admin3@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user3);

        User user4 = new User("admin4", "admin4",
                "admin4@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user4);

        User user5 = new User("admin5", "admin5",
                "admin5@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user5);

        User user6 = new User("admin6", "admin6",
                "admin6@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user6);

        User user7 = new User("admin7", "admin7",
                "admin7@admin7.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user7);

        User user8 = new User("admin8", "admin8",
                "admin8@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user8);

        User user9 = new User("admin9", "admin9",
                "admin9@gmail.com", "123456", RoleNames.ADMIN.name(), Boolean.TRUE);
        userService.saveUser(user9);

    }
}
