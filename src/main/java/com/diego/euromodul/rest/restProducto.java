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

import com.diego.euromodul.interfaces.IProducto;
import com.diego.euromodul.model.producto;

@RestController
@RequestMapping("/rest_producto")
public class restProducto {

	@Autowired
	private IProducto dataProducto;
	
	@GetMapping
	public List<producto> listar(){
		return (List<producto>)dataProducto.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody producto pro) {
		dataProducto.save(pro);
	}
	
	@PutMapping
	public void modificar(@RequestBody producto pro) {
		dataProducto.save(pro);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		dataProducto.deleteById(id);
	}
}
