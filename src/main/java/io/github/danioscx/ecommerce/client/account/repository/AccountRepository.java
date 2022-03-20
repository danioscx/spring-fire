package io.github.danioscx.ecommerce.client.account.repository;

import io.github.danioscx.ecommerce.client.account.models.Accounts;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface AccountRepository extends CrudRepository<Accounts, Long> {

}
