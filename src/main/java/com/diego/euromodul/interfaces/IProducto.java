package com.diego.euromodul.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diego.euromodul.model.producto;

@Repository
public interface IProducto extends CrudRepository<producto, Integer>{

}
