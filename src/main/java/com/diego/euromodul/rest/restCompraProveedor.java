package com.diego.euromodul.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.euromodul.interfaces.ICompraProveedor;
import com.diego.euromodul.model.compraProveedor;

@RestController
@RequestMapping("/rest_compraProveedor")
public class restCompraProveedor {

	@Autowired
	private ICompraProveedor dataCompraProveedor;
	
	@GetMapping
	public List<compraProveedor> listar(){
		return (List<compraProveedor>)dataCompraProveedor.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody compraProveedor prov) {
		dataCompraProveedor.save(prov);
	}
	
	@PutMapping
	public void modificar(@RequestBody compraProveedor prov) {
		dataCompraProveedor.save(prov);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		dataCompraProveedor.deleteById(id);
	}
}
