package com.diego.euromodul.interfaceService;

import java.util.List;
import java.util.Optional;

import com.diego.euromodul.model.presupuesto;

public interface IPresupuestoService {

	public List<presupuesto> listar();
	public Optional<presupuesto> listarId(int id);
	public int save(presupuesto pre);
	public void delete(int id);
}
