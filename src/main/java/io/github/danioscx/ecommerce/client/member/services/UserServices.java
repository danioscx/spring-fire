package io.github.danioscx.ecommerce.client.member.services;

import io.github.danioscx.ecommerce.client.member.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {


    @Autowired
    private UserRepository userRepository;

}
