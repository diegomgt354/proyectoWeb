package com.diego.euromodul.interfaceService;

import java.util.List;
import java.util.Optional;

import com.diego.euromodul.model.proveedor;

public interface IProveedorService {

	public List<proveedor> listar();
	public Optional<proveedor> listarId(int id);
	public int save(proveedor pro);
	public void delete(int id);
}
