package com.example.Projeto.Integrador.repositories;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
    @Query (value = "SELECT * FROM instrutor u WHERE u.email = :email",
        nativeQuery = true)
    Instrutor findByEmailInsrutor(@Param("email") String email);

}
