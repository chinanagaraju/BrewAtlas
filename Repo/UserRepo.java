package org.brewery.Repo;

import java.util.Optional;
import org.brewery.Brewery.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
    Users findByEmail(String email);

    Optional<Users> findByEmailAndPassword(String email, String password);
}
