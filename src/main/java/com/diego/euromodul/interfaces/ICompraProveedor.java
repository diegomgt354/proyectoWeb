package com.diego.euromodul.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diego.euromodul.model.compraProveedor;

@Repository
public interface ICompraProveedor extends CrudRepository<compraProveedor, Integer>{

}
