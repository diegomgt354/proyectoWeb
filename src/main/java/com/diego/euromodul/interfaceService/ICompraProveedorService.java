package com.diego.euromodul.interfaceService;

import java.util.List;
import java.util.Optional;

import com.diego.euromodul.model.compraProveedor;

public interface ICompraProveedorService {

	public List<compraProveedor> listar();
	public Optional<compraProveedor> listarId(int id);
	public int save(compraProveedor comprovee);
	public void delete(int id);
}
