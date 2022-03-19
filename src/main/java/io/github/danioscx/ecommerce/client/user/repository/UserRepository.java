package io.github.danioscx.ecommerce.client.user.repository;

import io.github.danioscx.ecommerce.client.user.models.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<Users, Long> {

    Users getUsersById(Long id);

    Users getUsersByUsername(String username);


}
