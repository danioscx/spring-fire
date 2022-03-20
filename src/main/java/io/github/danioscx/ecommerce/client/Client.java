package io.github.danioscx.ecommerce.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Client {

    @RestController
    @RequestMapping("api/v1/member")
    public static class Member {

        @RequestMapping({"/hi"})
        public String hi() {
            return "Hello world";
        }
    }

    public static class Merchant {

    }
}
