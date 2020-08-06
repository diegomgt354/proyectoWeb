package com.diego.euromodul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.euromodul.interfaceService.IClienteService;
import com.diego.euromodul.interfaces.ICliente;
import com.diego.euromodul.model.cliente;

@Service
public class clienteService implements IClienteService{

	@Autowired
	private ICliente dataCliente; 
	
	@Override
	public List<cliente> listar() {
		return (List<cliente>) dataCliente.findAll();
	}

	@Override
	public Optional<cliente> listarId(int id) {
		return dataCliente.findById(id);
	}

	@Override
	public int save(cliente cli) {
		int res=0;
		cliente cliente = dataCliente.save(cli);
		if(!cliente.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dataCliente.deleteById(id);	
	}
}
