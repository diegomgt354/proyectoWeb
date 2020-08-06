package com.diego.euromodul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.euromodul.interfaceService.IProductoService;
import com.diego.euromodul.interfaces.IProducto;
import com.diego.euromodul.model.producto;

@Service
public class productoService implements IProductoService{

	@Autowired
	private IProducto dataProducto;
	
	@Override
	public List<producto> listar() {
		return (List<producto>) dataProducto.findAll();
	}

	@Override
	public Optional<producto> listarId(int id) {
		return dataProducto.findById(id);
	}

	@Override
	public int save(producto pro) {
		int res=0;
		producto produ = dataProducto.save(pro);
		if(!produ.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dataProducto.deleteById(id);		
	}

}
