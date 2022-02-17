package org.vendas.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vendas.clientes.model.entify.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByUsername(String username);

    // select count(*) > 0 from usuario where usernam = :login
    boolean existsByUsername(String username);
}
