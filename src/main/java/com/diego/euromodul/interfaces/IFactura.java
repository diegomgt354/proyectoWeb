package com.diego.euromodul.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diego.euromodul.model.factura;

@Repository
public interface IFactura extends CrudRepository<factura, Integer>{

}
