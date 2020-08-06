package com.diego.euromodul.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diego.euromodul.model.presupuesto;

@Repository
public interface IPresupuesto extends CrudRepository<presupuesto, Integer>{

}
