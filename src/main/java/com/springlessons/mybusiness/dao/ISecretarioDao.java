package com.springlessons.mybusiness.dao;

import com.springlessons.mybusiness.entities.Secretario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ISecretarioDao extends CrudRepository<Secretario, String>{
    
}