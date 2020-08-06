package com.diego.euromodul.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Nombre", length = 40)
	private String Nombre;
	
	@Column(name = "Precio")
	private float Precio;
	
	@Column(name = "Familia", length = 40)
	private String Familia;
	
	@Column(name = "Referencia", length = 100)
	private String Referencia;
	
	public producto() {}

	public producto(int id, String nombre, float precio, String familia, String referencia) {
		this.id = id;
		this.Nombre = nombre;
		this.Precio = precio;
		this.Familia = familia;
		this.Referencia = referencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	public String getFamilia() {
		return Familia;
	}

	public void setFamilia(String familia) {
		Familia = familia;
	}

	public String getReferencia() {
		return Referencia;
	}

	public void setReferencia(String referencia) {
		Referencia = referencia;
	}
}
