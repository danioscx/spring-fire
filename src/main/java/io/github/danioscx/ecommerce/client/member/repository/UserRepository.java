package io.github.danioscx.ecommerce.client.member.repository;

import io.github.danioscx.ecommerce.client.member.models.Members;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Members, Long> {

    Members getUsersById(Long id);

    Members getUsersByUsername(String username);


}
