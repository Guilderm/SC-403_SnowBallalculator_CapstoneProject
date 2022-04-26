package dev.guilder.SnowballCalculator.UserManagement.Repository;

import dev.guilder.SnowballCalculator.UserManagement.Entitys.AppUser;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository extends CrudRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);
    //AppUser findByUsername(String username);

    @Transactional
    @Modifying
    @Query("UPDATE AppUser a " + "SET a.enabled = TRUE WHERE a.email = ?1")
    int enableAppUser(String email);
}
