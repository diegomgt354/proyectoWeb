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
@Table(name = "factura")
public class factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private cliente idCliente;
	
	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "pagada")
	private float pagada;
	
	@Column(name = "deuda")
	private float deuda;
	
	@Column(name = "total")
	private float total;
	
	@Column(name = "iva")
	private int iva;
	
	@Column(name = "TotalconIva")
	private float TotalconIva;
	
	public factura() {}

	public factura(int id, cliente idCliente, Date fecha, float pagada, float deuda, float total, int iva,
			float totalconIva) {
		this.id = id;
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.pagada = pagada;
		this.deuda = deuda;
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

	public float getPagada() {
		return pagada;
	}

	public void setPagada(float pagada) {
		this.pagada = pagada;
	}

	public float getDeuda() {
		return deuda;
	}

	public void setDeuda(float deuda) {
		this.deuda = deuda;
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
