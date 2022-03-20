package io.github.danioscx.ecommerce.client.account.services;

import io.github.danioscx.ecommerce.client.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountServices {

    private final AccountRepository accountRepository;

    public AccountServices(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


}
