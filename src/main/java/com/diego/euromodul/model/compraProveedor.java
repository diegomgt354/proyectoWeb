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
@Table(name = "compraProveedor")
public class compraProveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private factura idFactura;
	
	@ManyToOne
	private proveedor idProveedor;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "fechaVenci")
	private Date fechaVenci;
	
	@Column(name = "fechaPago")
	private Date fechaPago;
	
	@Column(name = "tipoPago")
	private String tipoPago;

	public compraProveedor() {
		
	}
	public compraProveedor(int id, factura idFactura, proveedor idProveedor, Date fecha, Date fechaVenci,
			Date fechaPago, String tipoPago) {
		this.id = id;
		this.idFactura = idFactura;
		this.idProveedor = idProveedor;
		this.fecha = fecha;
		this.fechaVenci = fechaVenci;
		this.fechaPago = fechaPago;
		this.tipoPago = tipoPago;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public factura getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(factura idFactura) {
		this.idFactura = idFactura;
	}
	public proveedor getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(proveedor idProveedor) {
		this.idProveedor = idProveedor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getFechaVenci() {
		return fechaVenci;
	}
	public void setFechaVenci(Date fechaVenci) {
		this.fechaVenci = fechaVenci;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
		
}
