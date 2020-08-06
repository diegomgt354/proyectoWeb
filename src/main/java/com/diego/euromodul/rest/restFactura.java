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

import com.diego.euromodul.interfaces.IFactura;
import com.diego.euromodul.model.factura;

@RestController
@RequestMapping("/rest_factura")
public class restFactura {

	@Autowired
	private IFactura dataFactura;
	
	@GetMapping
	public List<factura> listar(){
		return (List<factura>)dataFactura.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody factura fac) {
		dataFactura.save(fac);
	}
	
	@PutMapping
	public void modificar(@RequestBody factura fac) {
		dataFactura.save(fac);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		dataFactura.deleteById(id);
	}
}
