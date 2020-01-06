package com.angular.springboot.backend.apirest.models.dao;

import com.angular.backend.commons.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {}
