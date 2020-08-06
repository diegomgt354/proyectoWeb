package com.diego.euromodul.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diego.euromodul.model.proveedor;

@Repository
public interface IProveedor extends CrudRepository<proveedor, Integer>{

}
