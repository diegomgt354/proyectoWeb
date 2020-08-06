package com.diego.euromodul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.euromodul.interfaceService.IFacturaService;
import com.diego.euromodul.interfaces.IFactura;
import com.diego.euromodul.model.factura;

@Service
public class facturaService implements IFacturaService{

	@Autowired
	private IFactura dataFactura;
	
	@Override
	public List<factura> listar() {
		return (List<factura>)dataFactura.findAll();
	}

	@Override
	public Optional<factura> listarId(int id) {
		return dataFactura.findById(id);
	}

	@Override
	public int save(factura fac) {
		int res=0;
		factura factur = dataFactura.save(fac);
		if(!factur.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dataFactura.deleteById(id);
		
	}

}
