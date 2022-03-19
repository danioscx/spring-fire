package io.github.danioscx.ecommerce.client.user.services;

import io.github.danioscx.ecommerce.client.user.models.Users;
import io.github.danioscx.ecommerce.client.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {


    @Autowired
    private UserRepository userRepository;

}
