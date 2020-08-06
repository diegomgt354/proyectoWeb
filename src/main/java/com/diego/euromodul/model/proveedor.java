package com.diego.euromodul.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "DniNif")
	private String DniNif;
	
	@Column(name = "Direccion")
	private String Direccion;
	
	@Column(name = "codigoPostal")
	private String codigoPostal;
	
	@Column(name = "Fijo")
	private String Fijo;
	
	@Column(name = "Movil")
	private String Movil;
	
	@Column(name = "Email")
	private String Email;

	public proveedor() {}

	public proveedor(int id, String nombre, String dniNif, String direccion, String codigoPostal, String fijo,
			String movil, String email) {
		this.id = id;
		this.Nombre = nombre;
		this.DniNif = dniNif;
		this.Direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.Fijo = fijo;
		this.Movil = movil;
		this.Email = email;
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

	public String getDniNif() {
		return DniNif;
	}

	public void setDniNif(String dniNif) {
		DniNif = dniNif;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getFijo() {
		return Fijo;
	}

	public void setFijo(String fijo) {
		Fijo = fijo;
	}

	public String getMovil() {
		return Movil;
	}

	public void setMovil(String movil) {
		Movil = movil;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}	
		
}
