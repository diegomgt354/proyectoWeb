package com.diego.euromodul.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Nombre", length = 40)
	private String Nombre;
	
	@Column(name = "Apellido1", length = 40)
	private String Apellido1;
	
	@Column(name = "Apellido2", length = 40)
	private String Apellido2;
	
	@Column(name = "DniNif", length = 9)
	private String DniNif;
	
	@Column(name = "CodigoPostal", length = 5)
	private String CodigoPostal;
	
	@Column(name = "TelefonoFijo", length = 9)
	private String TelefonoFijo;
	
	@Column(name = "TelefonoMovil", length = 9)
	private String TelefonoMovil;
	
	@Column(name = "Email", length = 40)
	private String Email;

	public cliente() {}

	public cliente(int id, String nombre, String apellido1, String apellido2, String dniNif, String codigoPostal,
			String telefonoFijo, String telefonoMovil, String email) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellido1 = apellido1;
		this.Apellido2 = apellido2;
		this.DniNif = dniNif;
		this.CodigoPostal = codigoPostal;
		this.TelefonoFijo = telefonoFijo;
		this.TelefonoMovil = telefonoMovil;
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

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	public String getDniNif() {
		return DniNif;
	}

	public void setDniNif(String dniNif) {
		DniNif = dniNif;
	}

	public String getCodigoPostal() {
		return CodigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
	}

	public String getTelefonoFijo() {
		return TelefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		TelefonoFijo = telefonoFijo;
	}

	public String getTelefonoMovil() {
		return TelefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		TelefonoMovil = telefonoMovil;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
}
