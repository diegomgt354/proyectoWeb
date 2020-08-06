package com.diego.euromodul.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diego.euromodul.model.cliente;

@Repository
public interface ICliente extends CrudRepository<cliente, Integer>{

}
