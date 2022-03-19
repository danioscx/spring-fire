package io.github.danioscx.ecommerce.client.user.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class TokenManager implements Serializable {


    @Value("${secret}")
    private String jwtSecret;
}
