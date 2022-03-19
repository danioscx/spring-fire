package io.github.danioscx.ecommerce.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Client {

    @RestController
    public static class User {

        @RequestMapping({"/hi"})
        public String hi() {
            return "Hello world";
        }
    }

    public static class Merchant {

    }
}
