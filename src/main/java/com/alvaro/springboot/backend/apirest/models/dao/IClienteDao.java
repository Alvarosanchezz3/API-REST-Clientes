package com.alvaro.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.alvaro.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}