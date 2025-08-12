package com.irojas.demojwt.User;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUsername(String username);

@Modifying
    @Query("update Usuario u set u.firstName=:firstName, u.lastName=:lastName, u.emailId=:emailId where u.id=:id")
    void updateUsuario(
        @Param(value = "id") Integer id, 
        @Param(value = "firstName") String firstName,
        @Param(value = "lastName") String lastName, 
        @Param(value = "emailId") String emailId
    );
}