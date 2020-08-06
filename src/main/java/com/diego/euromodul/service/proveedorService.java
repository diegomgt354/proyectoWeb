package com.diego.euromodul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.euromodul.interfaceService.IProveedorService;
import com.diego.euromodul.interfaces.IProveedor;
import com.diego.euromodul.model.proveedor;

@Service
public class proveedorService implements IProveedorService{

	@Autowired
	IProveedor dataProveedor;
	
	@Override
	public List<proveedor> listar() {
		return (List<proveedor>)dataProveedor.findAll();
	}

	@Override
	public Optional<proveedor> listarId(int id) {
		return dataProveedor.findById(id);
	}

	@Override
	public int save(proveedor pro) {
		int res=0;
		proveedor provee = dataProveedor.save(pro);
		if(!provee.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dataProveedor.deleteById(id);
	}

}
