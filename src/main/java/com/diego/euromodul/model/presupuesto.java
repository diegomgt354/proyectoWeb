package com.diego.euromodul.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "presupuesto")
public class presupuesto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private cliente idCliente;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "total")
	private float total;
	
	@Column(name = "iva")
	private int iva;
	
	@Column(name = "TotalconIva")
	private float TotalconIva;

	public presupuesto() {}

	public presupuesto(int id, cliente idCliente, Date fecha, float total, int iva, float totalconIva) {
		this.id = id;
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.total = total;
		this.iva = iva;
		this.TotalconIva = totalconIva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public float getTotalconIva() {
		return TotalconIva;
	}

	public void setTotalconIva(float totalconIva) {
		TotalconIva = totalconIva;
	}	
}
