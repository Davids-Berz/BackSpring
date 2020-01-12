package com.angular.springboot.backend.apirest.models.services;

import com.angular.backend.commons.models.entity.Cliente;
import com.angular.springboot.backend.apirest.models.dao.IClienteDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {
    
    @Autowired
    IClienteDao clienteDao;

    private Logger log = LoggerFactory.getLogger(ClienteServiceImpl.class);

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteDao.findAll(pageable);
}

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        log.info("Sentencia con @Query en JPA");
        return clienteDao.buscarTodos();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }

}
