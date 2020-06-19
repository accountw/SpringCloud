package service;

import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;

/**
 * @author accountw
 * @date 2020-06-17 17:00
 * @description:
 */
public class UserServiceImpl {
    @Autowired
    private  UserRepository userRepository;
}
