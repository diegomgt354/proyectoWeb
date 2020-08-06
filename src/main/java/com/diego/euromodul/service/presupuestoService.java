package com.diego.euromodul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.euromodul.interfaceService.IPresupuestoService;
import com.diego.euromodul.interfaces.IPresupuesto;
import com.diego.euromodul.model.presupuesto;

@Service
public class presupuestoService implements IPresupuestoService{

	@Autowired
	private IPresupuesto dataPresupuesto; 
	
	@Override
	public List<presupuesto> listar() {
		return (List<presupuesto>) dataPresupuesto.findAll();
	}

	@Override
	public Optional<presupuesto> listarId(int id) {
		// TODO Auto-generated method stub
		return dataPresupuesto.findById(id);
	}

	@Override
	public int save(presupuesto pre) {
		int res=0;
		presupuesto pres = dataPresupuesto.save(pre);
		if(!pres.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dataPresupuesto.deleteById(id);
	}

}
