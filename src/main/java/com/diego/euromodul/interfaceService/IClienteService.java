package com.diego.euromodul.interfaceService;

import java.util.List;
import java.util.Optional;

import com.diego.euromodul.model.cliente;

public interface IClienteService {

	public List<cliente> listar();
	public Optional<cliente> listarId(int id);
	public int save(cliente cli);
	public void delete(int id);
}
