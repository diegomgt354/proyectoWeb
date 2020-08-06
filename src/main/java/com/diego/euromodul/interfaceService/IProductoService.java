package com.diego.euromodul.interfaceService;

import java.util.List;
import java.util.Optional;

import com.diego.euromodul.model.producto;

public interface IProductoService {

	public List<producto> listar();
	public Optional<producto> listarId(int id);
	public int save(producto pro);
	public void delete(int id);
}
