package com.diego.euromodul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.euromodul.interfaceService.ICompraProveedorService;
import com.diego.euromodul.interfaces.ICompraProveedor;
import com.diego.euromodul.model.compraProveedor;

@Service
public class compraProveedorService implements ICompraProveedorService{

	@Autowired
	private ICompraProveedor dataCompraProveedor;
	
	@Override
	public List<compraProveedor> listar() {
		return (List<compraProveedor>)dataCompraProveedor.findAll();
	}

	@Override
	public Optional<compraProveedor> listarId(int id) {
		return dataCompraProveedor.findById(id);
	}

	@Override
	public int save(compraProveedor comprovee) {
		int res=0;
		compraProveedor com = dataCompraProveedor.save(comprovee);
		if(!com.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dataCompraProveedor.deleteById(id);
		
	}

	
}
