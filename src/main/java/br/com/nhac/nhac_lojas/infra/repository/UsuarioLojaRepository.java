package br.com.nhac.nhac_lojas.infra.repository;

import br.com.nhac.nhac_lojas.model.loja.UsuarioLoja;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioLojaRepository extends JpaRepository<UsuarioLoja,Long> {

    Optional<UsuarioLoja> findByEmail(String email);
    boolean existsByEmail(String email);

}
