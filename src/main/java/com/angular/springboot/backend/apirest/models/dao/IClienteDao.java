package com.angular.springboot.backend.apirest.models.dao;

import com.angular.backend.commons.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

    @Query("Select c From Cliente c")
    List<Cliente> buscarTodos();

}