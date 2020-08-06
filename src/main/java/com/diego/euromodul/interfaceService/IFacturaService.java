package com.diego.euromodul.interfaceService;

import java.util.List;
import java.util.Optional;

import com.diego.euromodul.model.factura;

public interface IFacturaService {

	public List<factura> listar();
	public Optional<factura> listarId(int id);
	public int save(factura fac);
	public void delete(int id);
}
